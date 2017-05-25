package org.eclipse.epsilon.examples.standalone.evl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.eclipse.epsilon.examples.standalone.ProjectInfo;

/**
 * This class generates an excel file called report.xls with a report of all the statements found in the ETL Project
 * set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class ExcelPrincipalGeneratorComplex {
	
	/**
	 * An instance of EvlStandaloneExample
	 */
	private EvlStandaloneExample evl;
	
	/**
	 * The total number of bad smells in the catalog
	 */
	private final static int TOTAL_CODES = 23;
	
	/**
	 * EXCEL_FILE is the name of the generated XLS file with the report.
	 */
	private final static String EXCEL_FILE = "report.xls";
	
	/**
	 * ArrayList with all our evlConstraints
	 */
	private HashMap<String, ArrayList<String>> mainHashmap;
	
	/**
	 * REPOSITORY_PATH is the beggining of the url pointing to the file in the repository
	 */
	private final static String REPOSITORY_PATH = "https://github.com/NicolasBonet/ETLMetricsDataset/blob/master";
	
	public ExcelPrincipalGeneratorComplex(EvlStandaloneExample evlStandaloneExample, HashMap<String, ArrayList<String>> mainHashmap)
	{
		this.evl = evlStandaloneExample;
		this.mainHashmap = mainHashmap;
		
		try{
			generateReport();
		}
		catch (Exception e){ 
			e.printStackTrace();
		}
	}
	
	public void generateReport() throws InvalidFormatException, IOException {
		
		// Configure our destination file
		String destFile = evl.getReportsPath() + "/" + EXCEL_FILE;
		
		try {
			copyFileUsingStream(new File(evl.getReportsPath().replace("Reports", "template.xls")), new File(destFile));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Notify
		System.out.println("Generating report: " + destFile);
		
		// Main part first
		InputStream inp = new FileInputStream(destFile);
		Workbook workbook = WorkbookFactory.create(inp);
		Sheet sheet = workbook.getSheetAt(0);
		
		// Agregar los parsed models
		int editRow = 1;
		Row row = sheet.getRow(editRow);
		Cell cell = row.getCell(1);
		cell.setCellValue(evl.getCounterModelFiles().get("Github"));
		row = sheet.getRow(editRow);
		cell = row.getCell(2);
		cell.setCellValue(evl.getCounterModelFiles().get("Junior"));
		row = sheet.getRow(editRow);
		cell = row.getCell(3);
		cell.setCellValue(evl.getCounterModelFiles().get("Senior"));
		
		// Agregar los ETL files
		editRow++;
		row = sheet.getRow(editRow);
		cell = row.getCell(1);
		cell.setCellValue(evl.getCounterEtlFiles().get("Github"));
		row = sheet.getRow(editRow);
		cell = row.getCell(2);
		cell.setCellValue(evl.getCounterEtlFiles().get("Junior"));
		row = sheet.getRow(editRow);
		cell = row.getCell(3);
		cell.setCellValue(evl.getCounterEtlFiles().get("Senior"));
		
		// Grab metrics
		HashMap<String, HashMap <String, Double>> metrics = new HashMap<String, HashMap <String, Double>>();
		for (int c = 0; c < evl.getCategories().size(); c++)
		{
			String mainCategory = evl.getCategory(evl.getCategories().get(c));
			HashMap <String, Double> hmap = new HashMap <String, Double>();
			if (metrics.containsKey(mainCategory))
				hmap = metrics.get(mainCategory);
				
			ProjectInfo projectMetrics = new ProjectInfo(evl.getEtlpath() + "/" + evl.getCategories().get(c));
			projectMetrics.getOperationsInfo();
			
			try{
				double data = projectMetrics.getLoc();
				if (hmap.containsKey("loc"))
					data += hmap.get("loc");
					
				hmap.put("loc", data);
				
				data = projectMetrics.getRules();
				if (hmap.containsKey("rules"))
					data += hmap.get("rules");
					
				hmap.put("rules", data);
				
				data = projectMetrics.getLazyRules();
				if (hmap.containsKey("lazy"))
					data += hmap.get("lazy");
					
				hmap.put("lazy", data);
					
				data = projectMetrics.getOperationsHwc();
				if (hmap.containsKey("hwc"))
					data += hmap.get("hwc");
					
				hmap.put("hwc", data);
				
				data = projectMetrics.getOperationsHnc();
				if (hmap.containsKey("hnc"))
					data += hmap.get("hnc");
					
				hmap.put("hnc", data);
				
				data = projectMetrics.getNumIf();
				if (hmap.containsKey("if"))
					data += hmap.get("if");
					
				hmap.put("if", data);
				
				data = projectMetrics.getNumIterators();
				if (hmap.containsKey("iterators"))
					data += hmap.get("iterators");
					
				hmap.put("iterators", data);
				
				data = projectMetrics.getNumSelf();
				if (hmap.containsKey("self"))
					data += hmap.get("self");
					
				hmap.put("self", data);
				
				data = projectMetrics.getPromVars();
				if (hmap.containsKey("vars"))
					data += hmap.get("vars");
					
				hmap.put("vars", data);
				
				data = projectMetrics.getCallsOperationsPerRule();
				if (hmap.containsKey("operationsperrule"))
					data += hmap.get("operationsperrule");
					
				hmap.put("operationsperrule", data);
				
				data = projectMetrics.getCallsToLazyRules();
				if (hmap.containsKey("lazyperrule"))
					data += hmap.get("lazyperrule");
					
				hmap.put("lazyperrule", data);
				
				data = projectMetrics.getUselessOperations();
				if (hmap.containsKey("uselessoperations"))
					data += hmap.get("uselessoperations");
					
				hmap.put("uselessoperations", data);
				
				data = projectMetrics.getUselessParameters();
				if (hmap.containsKey("uselessparameters"))
					data += hmap.get("uselessparameters");
					
				hmap.put("uselessparameters", data);
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
			
			metrics.put(mainCategory, hmap);
		}
		
		// Agregar los LOC
		editRow = 3;
		row = sheet.getRow(editRow);
		cell = row.getCell(1);
		cell.setCellValue(metrics.get("Github").get("loc"));
		row = sheet.getRow(editRow);
		cell = row.getCell(2);
		cell.setCellValue(metrics.get("Junior").get("loc"));
		row = sheet.getRow(editRow);
		cell = row.getCell(3);
		cell.setCellValue(metrics.get("Senior").get("loc"));
		
		// Agregar los RULES
		editRow = 8;
		row = sheet.getRow(editRow);
		cell = row.getCell(1);
		cell.setCellValue(metrics.get("Github").get("rules"));
		row = sheet.getRow(editRow);
		cell = row.getCell(2);
		cell.setCellValue(metrics.get("Junior").get("rules"));
		row = sheet.getRow(editRow);
		cell = row.getCell(3);
		cell.setCellValue(metrics.get("Senior").get("rules"));
		
		// Agregar los demas
		String[] dataMetrics = {"lazy", "hwc", "hnc", "if", "iterators", "self", "vars", "operationsperrule", "lazyperrule", "uselessoperations", "uselessparameters"};
		editRow = 10;
		for (int i = 0; i < dataMetrics.length; i++)
		{
			row = sheet.getRow(editRow);
			cell = row.getCell(1);
			cell.setCellValue(metrics.get("Github").get(dataMetrics[i]));
			row = sheet.getRow(editRow);
			cell = row.getCell(2);
			cell.setCellValue(metrics.get("Junior").get(dataMetrics[i]));
			row = sheet.getRow(editRow);
			cell = row.getCell(3);
			cell.setCellValue(metrics.get("Senior").get(dataMetrics[i]));
			editRow++;
		}
		
		// Preparar los datos del segundo sheet
		HashMap<String, int[]> datos = new HashMap<String, int[]>();
		
		// Now each category
		for (int cat = 0; cat < evl.getCategories().size(); cat++)
		{
			System.out.println("Generating sheet: " + evl.getCategories().get(cat));
			sheet = workbook.cloneSheet(workbook.getSheetIndex("Datos"));
			workbook.setSheetName(workbook.getSheetIndex(sheet.getSheetName()), evl.getCategories().get(cat));
			
			String mainCategory = evl.getCategory(evl.getCategories().get(cat));
			
			int[] badSmellsCategory = new int[TOTAL_CODES];
			if (datos.containsKey(mainCategory))
				badSmellsCategory = datos.get(mainCategory);
	        
	        // For bold cells
			CellStyle style = workbook.createCellStyle();
	        Font boldFont = workbook.createFont();
	        boldFont.setFontHeightInPoints((short) 10);
	        boldFont.setFontName("Arial");
	        boldFont.setBold(true);
	        boldFont.setColor(IndexedColors.BLACK.getIndex());
	        boldFont.setItalic(false);
	        style.setFont(boldFont);
	        
	        // Set our current row to the first one
	        short currentRow = (short) 0;
	        
	        // First row includes all projects and bad smells codes.
	        row = sheet.getRow(0);
	        cell = row.createCell(0);
	        cell.setCellValue(evl.getCategories().get(cat));
	        cell.setCellStyle(style);
	        
	       // Array of constraints
			ArrayList<String> modelFileConstraints = mainHashmap.get(evl.getCategories().get(cat));
		        
			// Now add ocurrences!
			int[] badSmells = new int[TOTAL_CODES + 1];
			
			for (int c = 0; c < modelFileConstraints.size(); c++)
			{
				int codeNumber = Integer.parseInt(modelFileConstraints.get(c).substring(1, 3));
				badSmells[codeNumber - 1]++;
				badSmellsCategory[codeNumber - 1]++;
			}
			
	        for (int code = 1; code <= TOTAL_CODES; code++)
	        {
	        	row = sheet.getRow(2 + code);
	        	row.createCell(1).setCellValue(badSmells[code - 1]);
	        }
	        
	       // Store it
	        datos.put(mainCategory, badSmellsCategory);
		}
		
		// Delete the datos sheet
		workbook.removeSheetAt(workbook.getSheetIndex("Datos"));
		
		// Ahora el segundo sheet
		sheet = workbook.getSheetAt(workbook.getSheetIndex("Unificados"));
		
		for (String mainCategory : datos.keySet())
		{
			for (int code = 1; code <= TOTAL_CODES; code++)
			{
				int codeRow = code + 1;
				row = sheet.getRow(codeRow);
				row.getCell(getCategoryColumn(mainCategory)).setCellValue(datos.get(mainCategory)[code - 1]);
			}
		}
		
        //Close the InputStream  
        try {
        	FileOutputStream fileOut = new FileOutputStream(destFile);
			workbook.write(fileOut);
	        fileOut.close();
	        workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		// Log it
        System.out.println("The excel report has being generated at " + destFile);
	}
	
	/**
	 * Copies the source file into the location defined on destination.
	 * @param source
	 * @param dest
	 * @throws IOException
	 */
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
	/**
	 * getCategoryColumn
	 * @param category
	 * @return
	 */
	public int getCategoryColumn(String category){
		if (category.equals("Senior"))
			return 3;
		else if (category.equals("Junior"))
			return 2;
		else if (category.equals("Github"))
			return 1;
		
		return -1;
	}
}
