package generators;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Map;

import identifier.BadSmellsFinder;

/**
 * This class generates HTML Reports with all the statements found in the ETL Project set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class HTMLGenerator {
	
	private BadSmellsFinder projectsAnalyzer;
	
	/**
	 * TEMPLATE_FILE is the location of the template
	 */
	private final static String ASSETS_DIRECTORY = "html_template";
	
	/**
	 * This is our constructor
	 */
	public HTMLGenerator(String inputDirectory, String outputDirectory)
	{
		projectsAnalyzer = new BadSmellsFinder(inputDirectory, outputDirectory);
	}
	
	public void generateReport() {
		
		// Generate the file!
		try {
			
			// The reports directory
			File reportsDirectory = new File(projectsAnalyzer.getOutputDirectory() + "/html");
			reportsDirectory.mkdir();
			
			// The assets directory
			File assetsDirectory = new File(projectsAnalyzer.getOutputDirectory() + "/html/assets");
			assetsDirectory.mkdir();
			
			// Load JS and CSS files
			File fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.min.js");
			fileAsset.delete();
			fileAsset.createNewFile();
			copyFile(new File(ASSETS_DIRECTORY + "/assets/Chart.min.js"), fileAsset);
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.StackedBar.js");
			fileAsset.delete();
			fileAsset.createNewFile();
			copyFile(new File(ASSETS_DIRECTORY + "/assets/Chart.StackedBar.js"), fileAsset);
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/ETLPluginStyle.css");
			fileAsset.delete();
			fileAsset.createNewFile();
			copyFile(new File(ASSETS_DIRECTORY + "/assets/ETLPluginStyle.css"), fileAsset);
			
			// Now the report files
			File file = new File(reportsDirectory.getAbsolutePath() + "/index.html");
			file.delete();
			file.createNewFile();
			
			// Start the main report
			String header = "<h2>Menu: <select name=\"URL\" onchange=\"doMenu();\" id=\"menu\"><option selected=\"selected\" value=\"" + reportsDirectory.getAbsolutePath() + "/index.html\">Project Metrics</option>";
			
			// Add the menu
			for (int i = 0; i < projectsAnalyzer.getModelFiles().size(); i++)
			{
				header += "<option data-index=\"" + i + "\" value=\"" + projectsAnalyzer.getModelFiles().get(i).getAbsolutePath().replace(projectsAnalyzer.getInputDirectory(), reportsDirectory.getAbsolutePath()) + ".html\">" + projectsAnalyzer.getModelFiles().get(i).getName() + "</option>";
			}
			
			header += "</select></h2> <script type=\"text/javascript\">" +
		    "function doMenu()" +
		    "{" +
			    "var e = document.getElementById(\"menu\");" +
			    "window.location = e.options[e.selectedIndex].value;" +
		    "}" +
		    "</script>"
		    + "<br class=\"clear\" />";
			
			// Add the header title
			String mainFileContent = fileToString(new File(ASSETS_DIRECTORY + "/widget.html").getAbsolutePath());
			mainFileContent = mainFileContent.replace("<!-- MENU_HEADER -->", header);
			
			// Replace assets and prepare the template
			mainFileContent = mainFileContent.replaceAll("<%(.*\n)*%>", "");
			
			// Setup a page title
			mainFileContent = mainFileContent.replaceAll("<!-- PAGE_TITLE -->", "Project Metrics");
			
			// Now add ocurrences!
			int[] badSmells = new int[24];
			int[] categoriesConstraints = new int[3];
			String ocurrencesString = "";
			
			for (Map.Entry<File, ArrayList<String>> entry : projectsAnalyzer.getEvlConstraints().entrySet())
			{
				for (int i = 0; i < entry.getValue().size(); i++)
				{
					int codeNumber = Integer.parseInt(entry.getValue().get(i).substring(1, 3));
					badSmells[codeNumber - 1]++;
					
					if (codeNumber <= 2)
						categoriesConstraints[0]++;
					else if (codeNumber >= 3 && codeNumber <= 13)
						categoriesConstraints[1]++;
					else if (codeNumber > 13)
						categoriesConstraints[2]++;
				}
			}
			
			double totalOfBadSmells = categoriesConstraints[0] + categoriesConstraints[1] + categoriesConstraints[2];
			
			// Our coefficient
			double coe = 0;
			if (totalOfBadSmells > 0)
				coe = 100.0 / totalOfBadSmells;
			
			// Replace ocurrences
			for (int i = 0; i < 24; i++)
			{
				System.out.println("Total: " + totalOfBadSmells  + " - Coe:" + coe + " - Ocurrences: " + badSmells[i]);
				
				// Porcentage of ocurrences
				double porcentage = Math.round(coe * badSmells[i]);
				
				// Calculate how to show our code
				String code = (i + 1) + "";
				if (i < 9)
				{
					code = "0" + (i + 1);
				}
				
				// Add our HTML
				ocurrencesString += "<tr>" +
								"<td>" +
									code +
								"</td>" +
								"<td>" +
									badSmells[i] + " ocurrences" +
									"<div class=\"progress\" style=\"margin-bottom: 0px;\">" +
										"<div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"" + porcentage + "\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: " + porcentage + "%;\">" +
										porcentage + "%" +
									    "</div>" +
									"</div>" +
								"</td>" +
							"</tr>";
			}
			
			// Add ocurrences to our output
			mainFileContent = mainFileContent.replace("<!-- CODES_OCURRENCES -->", ocurrencesString);
			
			// Get total
			mainFileContent = mainFileContent.replaceAll("<!-- TOTAL_OCURRENCES -->", totalOfBadSmells + "");
			
			// Now based on category
			mainFileContent = mainFileContent.replaceAll("<!-- RENAMING_OCURRENCES -->", categoriesConstraints[0] + "");
			mainFileContent = mainFileContent.replaceAll("<!-- REESTRUCTURING_OCURRENCES -->", categoriesConstraints[1] + "");
			mainFileContent = mainFileContent.replaceAll("<!-- OCL_OPTIMIZATION_OCURRENCES -->", categoriesConstraints[2] + "");
			
			// Write it!
			writeStringToFile(file, mainFileContent);
			
			// Log it into our GUI
			projectsAnalyzer.logLine(file.getPath() + " has being written");
			
			// Now each individual model file!
			ArrayList<File> modelFiles = projectsAnalyzer.getModelFiles();
			
			for (int m = 0; m < modelFiles.size(); m++)
			{
				// Array of constraints
				ArrayList<String> modelFileConstraints = projectsAnalyzer.getEvlConstraints().get(modelFiles.get(m));
				
				// Now the report files
				File internalFile = new File(modelFiles.get(m).getAbsolutePath().replace(projectsAnalyzer.getInputDirectory(), reportsDirectory.getAbsolutePath()) + ".html");
				internalFile.delete();
				internalFile.getParentFile().mkdirs();
				internalFile.createNewFile();
				
				// Start the main report
				String newHeader = header.replace("<option selected=\"selected\" value=\"./index.html\">Project Metrics</option>", "");
				newHeader = header.replace("data-index=\"" + m + "\"", "data-index=\"" + m + "\" selected=\"selected\"");
				
				// Add the header title
				mainFileContent = fileToString(new File(ASSETS_DIRECTORY + "/widget.html").getAbsolutePath());
				mainFileContent = mainFileContent.replace("<!-- MENU_HEADER -->", newHeader);
				
				// Replace assets and prepare the template
				mainFileContent = mainFileContent.replaceAll("<%(.*\n)*%>", "");
				
				// Setup a page title
				mainFileContent = mainFileContent.replaceAll("<!-- PAGE_TITLE -->", modelFiles.get(m).getName());
				
				// Now add ocurrences!
				categoriesConstraints = new int[3];
				badSmells = new int[24];
				ocurrencesString = "";
				
				for (int i = 0; i < modelFileConstraints.size(); i++)
				{
					int codeNumber = Integer.parseInt(modelFileConstraints.get(i).substring(1, 3));
					badSmells[codeNumber - 1]++;
					
					if (codeNumber <= 2)
						categoriesConstraints[0]++;
					else if (codeNumber >= 3 && codeNumber <= 13)
						categoriesConstraints[1]++;
					else if (codeNumber > 13)
						categoriesConstraints[2]++;
				}
				
				totalOfBadSmells = categoriesConstraints[0] + categoriesConstraints[1] + categoriesConstraints[2];
				
				// Our coefficient
				coe = 0.0;
				if (modelFileConstraints.size() > 0)
					coe = 100.0 / totalOfBadSmells;
				
				// Replace ocurrences
				for (int i = 0; i < 24; i++)
				{
					// Porcentage of ocurrences
					double porcentage = Math.round(coe * badSmells[i]);
					
					System.out.println("Ocurrences: " + coe + " - " + badSmells[i]);
					
					// Calculate how to show our code
					String code = (i + 1) + "";
					if (i < 9)
					{
						code = "0" + (i + 1);
					}
					
					// Add our HTML
					ocurrencesString += "<tr>" +
									"<td>" +
										code +
									"</td>" +
									"<td>" +
										badSmells[i] + " ocurrences" +
										"<div class=\"progress\" style=\"margin-bottom: 0px;\">" +
											"<div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"" + porcentage + "\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: " + porcentage + "%;\">" +
											porcentage + "%" +
										    "</div>" +
										"</div>" +
									"</td>" +
								"</tr>";
				}
				
				// Add ocurrences to our output
				mainFileContent = mainFileContent.replace("<!-- CODES_OCURRENCES -->", ocurrencesString);
				
				// Get total
				mainFileContent = mainFileContent.replaceAll("<!-- TOTAL_OCURRENCES -->", totalOfBadSmells + "");
				
				// Now based on category
				mainFileContent = mainFileContent.replaceAll("<!-- RENAMING_OCURRENCES -->", categoriesConstraints[0] + "");
				mainFileContent = mainFileContent.replaceAll("<!-- REESTRUCTURING_OCURRENCES -->", categoriesConstraints[1] + "");
				mainFileContent = mainFileContent.replaceAll("<!-- OCL_OPTIMIZATION_OCURRENCES -->", categoriesConstraints[2] + "");
				
				// Write it!
				writeStringToFile(internalFile, mainFileContent);
				
				// Log it!
				projectsAnalyzer.logLine(internalFile.getPath() + " has being written");
			}
			
			// Open it
			if (Desktop.isDesktopSupported())
			{
				try {
					// Log it!
					projectsAnalyzer.logLine("Opening report in web browser...");
					
					// Open web browser
					Desktop.getDesktop().browse(new URI("file://" + reportsDirectory.getAbsolutePath().replace(" ", "%20") + "/index.html"));
					
					// Log it!
					projectsAnalyzer.logLine("Report has being opened");
					
				} catch (URISyntaxException e) {
					// Log it!
					projectsAnalyzer.logLine("<span style=\"color: red;\">Please manually open the report</span>");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Este metodo convierte el contenido del archivo especificado como parametro y retorna un string con su contenido
	 * @param path, el directorio del archivo
	 * @return
	 */
	private String fileToString(String path) {
		File file = new File(path);
        FileInputStream fis = null;
        String str = "";

        try {
            fis = new FileInputStream(file);
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                str += (char) content;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        return str;
	}
	
	/**
	 * Este metodo toma un String como parametro y poner su valor como contenido del archivo enviado como parametro
	 * @param file, el archivo a escribir
	 * @param content el contenido del archivo
	 * @return void
	 */
	private void writeStringToFile(File file, String content) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.flush();
		fileWriter.close();
	}
	
	/**
	 * Este metodo copia un archivo de una ubicación a otra
	 * @param sourceFile, el archivo origen
	 * @param destFile, el archivo destino
	 * @return void
	 */
	private static void copyFile(File sourceFile, File destFile) throws IOException {
	    if(!destFile.exists()) {
	        destFile.createNewFile();
	    }

	    FileChannel source = null;
	    FileChannel destination = null;

	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destFile).getChannel();
	        destination.transferFrom(source, 0, source.size());
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		HTMLGenerator htmlGenerator = new HTMLGenerator(args[0], args[1]);
		htmlGenerator.generateReport();
	}
}
