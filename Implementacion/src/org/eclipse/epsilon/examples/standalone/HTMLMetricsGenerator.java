package org.eclipse.epsilon.examples.standalone;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;

/**
 * This class generates HTML Reports with all the statements found in the ETL Project set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class HTMLMetricsGenerator {
	
	private ProjectInfo projectMetrics;
	
	/**
	 * TEMPLATE_FILE is the location of the template
	 */
	private final static String ASSETS_DIRECTORY = "/Users/nicolas/Documents/workspaces/workspace-haetae/co.edu.uniandes.badSmellsFinder/html_template";
	
	/**
	 * This is our constructor
	 */
	public HTMLMetricsGenerator(String inputDirectory, String outputDirectory)
	{
		this.projectMetrics = new ProjectInfo(inputDirectory);
		this.projectMetrics.getOperationsInfo();
		generateReport(outputDirectory);
	}
	
	public void generateReport(String outputDirectory) {
		
		// Generate the file!
		try {
			
			// The reports directory
			File reportsDirectory = new File(outputDirectory + "/html");
			reportsDirectory.mkdir();
			
			// The assets directory
			File assetsDirectory = new File(outputDirectory + "/html/assets");
			assetsDirectory.mkdir();
			
			// Load JS and CSS files
			File fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.min.js");
			copyFile(new File(ASSETS_DIRECTORY + "/assets/Chart.min.js"), fileAsset);
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/Chart.StackedBar.js");
			copyFile(new File(ASSETS_DIRECTORY + "/assets/Chart.StackedBar.js"), fileAsset);
			
			fileAsset = new File(assetsDirectory.getAbsolutePath() + "/ETLPluginStyle.css");
			copyFile(new File(ASSETS_DIRECTORY + "/assets/ETLPluginStyle.css"), fileAsset);
			
			// Now the report files
			File file = new File(reportsDirectory.getAbsolutePath() + "/metrics.html");
			file.delete();
			file.createNewFile();
			
			// Add the header title
			String mainFileContent = fileToString(new File(ASSETS_DIRECTORY + "/metrics.html").getAbsolutePath());
			
			// Setup a page title
			mainFileContent = mainFileContent.replaceAll("<!-- PAGE_TITLE -->", "Project Metrics");
			
			// Replace assets and prepare the template
			mainFileContent = mainFileContent.replaceAll("<!-- num_src_models -->", projectMetrics.getNumSrcModels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_trg_models -->", projectMetrics.getNumTrgModels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_rules -->", projectMetrics.getRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_lazy_rules -->", projectMetrics.getLazyRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_abstract_rules -->", projectMetrics.getAbstractRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_greedy_rules -->", projectMetrics.getGreedyRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- average_coverage_input_mm -->", projectMetrics.getCoverageInputMetamodels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- average_coverage_output_mm -->", projectMetrics.getCoverageOutputMetamodels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- average_size_input_mm -->", projectMetrics.getPromSizeInputMetamodels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- average_size_output_mm -->", projectMetrics.getPromSizeOutputMetamodels() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_parameters -->", projectMetrics.getParameters() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_useless_parameters -->", projectMetrics.getUselessParameters() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_operations -->", projectMetrics.getOperations() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_useless_operations -->", projectMetrics.getUselessOperations() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_if -->", projectMetrics.getNumIf() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_iterators -->", projectMetrics.getNumIterators() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_self -->", projectMetrics.getNumSelf() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_ocl_operations -->", projectMetrics.getNumOclOperations() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_call_operations_per_rule -->", projectMetrics.getCallsOperationsPerRule() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_call_lazy_rule -->", projectMetrics.getPromCallsToLazyRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_call_lazy_per_rule -->", projectMetrics.getCallsToLazyRules() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_loc -->", projectMetrics.getLoc() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- is_declarative -->", (projectMetrics.isDeclarative() ? "Yes" : "No"));
			mainFileContent = mainFileContent.replaceAll("<!-- avarage_variables_per_rule -->", projectMetrics.getPromVars() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_guards -->", projectMetrics.getGuards() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_libraries -->", projectMetrics.getLibraries() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_hnc -->", projectMetrics.getOperationsHnc() + "");
			mainFileContent = mainFileContent.replaceAll("<!-- num_hwc -->", projectMetrics.getOperationsHwc() + "");
			
			// Write it!
			writeStringToFile(file, mainFileContent);
			
			// Log it into our GUI
			projectMetrics.logLine(file.getPath() + " has being written");
			
			// Open it
			if (Desktop.isDesktopSupported())
			{
				try {
					// Log it!
					projectMetrics.logLine("Opening report in web browser...");
					
					// Open web browser
					Desktop.getDesktop().browse(new URI("file://" + reportsDirectory.getAbsolutePath().replace(" ", "%20") + "/metrics.html"));
					
					// Log it!
					projectMetrics.logLine("Metrics report has being opened");
					
				} catch (URISyntaxException e) {
					// Log it!
					projectMetrics.logLine("<span style=\"color: red;\">Please manually open the metrics report</span>");
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
	    	new File(destFile.getPath().replace(destFile.getName(), "")).mkdirs();
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
}
