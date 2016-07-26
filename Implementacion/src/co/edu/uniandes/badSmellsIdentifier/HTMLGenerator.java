package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class HTMLGenerator {
	
	private ProjectsAnalyzer projectsAnalyzer;
	
	/**
	 * TEMPLATE_FILE is the location of the template
	 */
	private final static String TEMPLATE_FILE = "finder/widget.html";
	
	/**
	 * REPORTS_DIRECTORY is the location of the template
	 */
	private final static String REPORTS_DIRECTORY = "output";
	
	/**
	 * This is our constructor
	 */
	public HTMLGenerator()
	{
		ProjectsAnalyzer projectsAnalyzer = new ProjectsAnalyzer();
	}
	
	public void generateReport() {
		
		// Generate the file!
		try {
			
			// The reports directory
			File reportsDirectory = new File(projectsAnalyzer.getOutputDirectory());
			reportsDirectory.mkdir();
			
			// The assets directory
			File assetsDirectory = new File(projectsAnalyzer.getOutputDirectory() + "/assets");
			assetsDirectory.mkdir();
			
			// Load JS and CSS files
			File fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.min.js");
			fileAsset.delete();
			fileAsset.createNewFile();
			writeStringToFile(fileAsset, fileToString("/static/Chart.min.js"));
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.StackedBar.js");
			fileAsset.delete();
			fileAsset.createNewFile();
			writeStringToFile(fileAsset, fileToString("/static/Chart.StackedBar.js"));
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/ETLPluginStyle.css");
			fileAsset.delete();
			fileAsset.createNewFile();
			writeStringToFile(fileAsset, fileToString("/static/ETLPluginStyle.css"));
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/bootstrap.min.css");
			fileAsset.delete();
			fileAsset.createNewFile();
			writeStringToFile(fileAsset, fileToString("/static/bootstrap.min.css"));
			
			// Now the report files
			File file = new File(reportsDirectory.getAbsolutePath() + "/index.html");
			file.delete();
			file.createNewFile();
			
			// Start the main report
			String header = "<h2>Menu: <select name=\"URL\" onchange=\"doMenu();\" id=\"menu\"><option selected=\"selected\" value=\"./index.html\">Project Metrics</option>";
			
			// Add the menu
			for (int i = 0; i < projectsAnalyzer.getModelFiles().size(); i++)
				header += "<option value=\"./" + projectsAnalyzer.getModelFiles().get(i).getName().replace(".model", "") + ".html\">" + projectsAnalyzer.getModelFiles().get(i).getName() + "</option>";
			
			header += "</select></h2> <script type=\"text/javascript\">" +
		    "function doMenu()" +
		    "{" +
			    "var e = document.getElementById(\"menu\");" +
			    "window.location = e.options[e.selectedIndex].value;" +
		    "}" +
		    "</script>"
		    + "<h1>Project Metrics</h1><br class=\"clear\" />";
			
			// Add the header title
			String mainFileContent = fileToString("finder/widget.html");
			mainFileContent = mainFileContent.replace("<!-- MENU_HEADER -->", header);
			
			// Replace assets and prepare the template
			mainFileContent = mainFileContent.replaceAll("<%(.*\n)*%>", "");
			
			// Replace metrics
			List<Metric> metrics = new DataMetrics().getMetrics();
			
			// Count if there is any MM at all!
			boolean anyMetamodel = false;
			
			for (int i = 0; i < metrics.size(); i++)
			{
				mainFileContent = mainFileContent.replaceAll("<%= get_etl_metric[(]'" + metrics.get(i).getName() + "'[)] -%>", projectsAnalyzer.getData().get(0).get(metrics.get(i)).toString());
				mainFileContent = mainFileContent.replaceAll("<%= get_is_true[(]'" + metrics.get(i).getName() + "'[)] -%>", projectsAnalyzer.getData().get(0).get(metrics.get(i)).toString());
				
				if (metrics.get(i).getName().equals(DataMetrics.AVERAGE_COVERAGE_INPUT_MM.getName()) && !projectsAnalyzer.getData().get(0).get(metrics.get(i)).toString().equals("0.0"))
				{
					anyMetamodel = true;
				}
				else if (metrics.get(i).getName().equals(DataMetrics.AVERAGE_COVERAGE_OUTPUT_MM.getName()) && !projectsAnalyzer.getData().get(0).get(metrics.get(i)).toString().equals("0.0"))
				{
					anyMetamodel = true;
				}
			}
			
			// No metamodel, no graphic
			if (!anyMetamodel)
			{
				mainFileContent = mainFileContent.replaceAll("<div id=\"mm_coverage_notice\" style=\"display: none;\" class=\"alert alert-danger\">", "<div id=\"mm_coverage_notice\" style=\"display: block;\" class=\"alert alert-danger\">");
				mainFileContent = mainFileContent.replaceAll("<div id=\"mm_coverage\" style=\"display: block;\">", "<div id=\"mm_coverage\" style=\"display: none;\">");
			}
			
			// Now bindings coverage
			String tableBody = "", jsBody = "";
			
			// Load the hashmap
			HashMap<String, ArrayList<String>> bindingData = (HashMap<String, ArrayList<String>>) projectsAnalyzer.getData().get(0).get(DataMetrics.BINDINGS_COVERAGE);
			
			// Start populating the data!
			Set set = bindingData.entrySet();
			Iterator iterator = set.iterator();
			int x = 0, y = 50;
			
			// Go through the entire hashmap
			while(iterator.hasNext())
			{
				// The value itself
				Map.Entry me = (Map.Entry) iterator.next();
				
				// The first part of the table
				tableBody += "<tr><td>" + me.getKey() + "</td><td>";
								
				// Populate all classes
				ArrayList<String> classes = (ArrayList<String>) me.getValue();
				
				// Concatenated string
				String classAttributes = "";
				
				for (int c = 0; c < classes.size(); c++)
				{
					tableBody += classes.get(c);
					classAttributes += "'" + classes.get(c) + ": String'";
					
					if (c < (classes.size() - 1))
					{
						tableBody += ", ";
						classAttributes += ", ";
					}
				}
						
				// Close the row
				tableBody += "</td></tr>";
				
				// Re start
				if (x == 450)
				{
					x = 150;
					y += 100;
				}
				else
					x += 150;
				
				jsBody += me.getKey() + ": new uml.Class({" +
				        "position: { x:" + x + "  , y: " + y + " }," +
				        "size: { width: 240, height: 100 }," +
				        "name: '" + me.getKey() + "'," +
				        "attributes: [" + classAttributes + "]," +
				        "methods: []" +
				    "}),";
			}
			
			// Replace it!
			mainFileContent = mainFileContent.replaceAll("<% COVERED BINDING %>", tableBody);
			mainFileContent = mainFileContent.replaceAll("<% COVERED BINDING JS %>", jsBody);
			
			// Add the footer
			mainFileContent += ""
			+ "			</div><!-- /.container -->"
			+ "		</body>"
			+ "</html>";
			
			// Change some bootstrap classes
			mainFileContent = mainFileContent.replace("class=\"widget-row\"", "class=\"row\"");
			mainFileContent = mainFileContent.replace("widget-span-", "col-md-");
			
			// Write it!
			writeStringToFile(file, mainFileContent);
			
			// Log it into our GUI
			projectsAnalyzer.logLine(file.getPath() + " has being written");
			
			// Now each individual ETL file!
			ArrayList<File> etlFiles = projectsAnalyzer.getEtlFiles();
			
			for (int f = 1; f < etlFiles.size() + 1; f++)
			{
				// Now the report files
				File internalFile = new File(reportsDirectory.getAbsolutePath() + "/" + etlFiles.get(f - 1).getName().replace(".etl", "") + ".html");
				internalFile.delete();
				internalFile.createNewFile();
				
				// Start the main report
				header = fileToString("/static/header.html");
				header = header.replace("{title}", etlFiles.get(f - 1).getName()) + "<h2>Menu: <select name=\"URL\" onchange=\"doMenu();\" id=\"menu\"><option value=\"./index.html\">Project Metrics</option>";
				
				// Add the menu
				for (int z = 0; z < projectsAnalyzer.getEtlFiles().size(); z++)
					header += "<option" + (projectsAnalyzer.getEtlFiles().get(z).getName().equals(etlFiles.get(f - 1).getName()) ? " selected=\"selected\"" : "") + " value=\"./" + projectsAnalyzer.getEtlFiles().get(z).getName().replace(".etl", "") + ".html\">" + projectsAnalyzer.getEtlFiles().get(z).getName() + "</option>";
				
				header += "</select></h2> <script type=\"text/javascript\">" +
			    "function doMenu()" +
			    "{" +
				    "var e = document.getElementById(\"menu\");" +
				    "window.location = e.options[e.selectedIndex].value;" +
			    "}" +
			    "</script>";
				
				// Start the file report
				String internalMainFileContent = header + "<h1>" + etlFiles.get(f - 1).getName() + "</h1><br class=\"clear\" />";;
				
				// Content!
				internalMainFileContent += fileToString("/uniandes/plugins/sonarqube/etlplugin/widget.html.erb");
				
				// Replace assets and prepare the template
				internalMainFileContent = internalMainFileContent.replace("<%= url_for_static(:plugin => 'etldataplugin', :path => 'Chart.min.js')-%>", "./static/Chart.min.js");
				internalMainFileContent = internalMainFileContent.replace("<%= url_for_static(:plugin => 'etldataplugin', :path => 'Chart.StackedBar.js')-%>", "./static/Chart.StackedBar.js");
				internalMainFileContent = internalMainFileContent.replace("<%= url_for_static(:plugin => 'etldataplugin', :path => 'ETLPluginStyle.css')-%>", "./static/ETLPluginStyle.css");
				internalMainFileContent = internalMainFileContent.replaceAll("<%(.*\n)*%>", "");
				
				// Replace metrics
				for (int i = 0; i < metrics.size(); i++)
				{
					internalMainFileContent = internalMainFileContent.replaceAll("<%= get_etl_metric[(]'" + metrics.get(i).getName() + "'[)] -%>", projectsAnalyzer.getData().get(f).get(metrics.get(i)).toString());
					internalMainFileContent = internalMainFileContent.replaceAll("<%= get_is_true[(]'" + metrics.get(i).getName() + "'[)] -%>", projectsAnalyzer.getData().get(f).get(metrics.get(i)).toString());
				}
				
				// Now bindings coverage
				tableBody = "";
				
				// Load the hashmap
				bindingData = (HashMap<String, ArrayList<String>>) projectsAnalyzer.getData().get(f).get(DataMetrics.BINDINGS_COVERAGE);
				
				// Start populating the data!
				set = bindingData.entrySet();
				iterator = set.iterator();
				
				// Go through the entire hashmap
				while(iterator.hasNext())
				{
					// The value itself
					Map.Entry me = (Map.Entry) iterator.next();
					
					// The first part of the table
					tableBody += "<tr><td>" + me.getKey() + "</td><td>";
					
					// Populate all classes
					ArrayList<String> classes = (ArrayList<String>) me.getValue();
					
					for (int c = 0; c < classes.size(); c++)
					{
						tableBody += classes.get(c);
						
						if (c < (classes.size() - 1))
							tableBody += ", ";
					}
							
					// Close the row
					tableBody += "</td></tr>";
				}
				
				// Replace it!
				internalMainFileContent = internalMainFileContent.replaceAll("<% COVERED BINDING %>", tableBody);
				
				// Add the footer
				internalMainFileContent += ""
				+ "			</div><!-- /.container -->"
				+ "		</body>"
				+ "</html>";
				
				// Change some bootstrap classes
				internalMainFileContent = internalMainFileContent.replace("class=\"widget-row\"", "class=\"row\"");
				internalMainFileContent = internalMainFileContent.replace("widget-span-", "col-md-");
				
				// Write it!
				writeStringToFile(internalFile, internalMainFileContent);
				
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
	
	private String fileToString(String path) {
		InputStream in = getClass().getResourceAsStream(path);
		java.util.Scanner s = new java.util.Scanner(in).useDelimiter("\\A");
		return s.hasNext() ? s.next() : "";
	}
	
	private void writeStringToFile(File file, String content) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.flush();
		fileWriter.close();
	}
}
