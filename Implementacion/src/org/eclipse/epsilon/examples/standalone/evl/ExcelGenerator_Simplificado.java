package org.eclipse.epsilon.examples.standalone.evl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 * This class generates an excel file called report.xls with a report of all the statements found in the ETL Project
 * set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class ExcelGenerator_Simplificado {
	
	/**
	 * An instance of reportsDir
	 */
	private String reportsDir;
	
	/**
	 * An instance of modelsDir
	 */
	private String modelsDir;
	
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
	private ArrayList<String> evlConstraints;
	
	/**
	 * The model we are processing
	 */
	private String modelLocation;
	
	/**
	 * REPOSITORY_PATH is the beggining of the url pointing to the file in the repository
	 */
	private final static String REPOSITORY_PATH = "https://github.com/NicolasBonet/ETLMetricsDataset/blob/master";
	
	public ExcelGenerator_Simplificado(String reportsDir, String modelsDir, String modelLocation, ArrayList<String> evlConstraints)
	{
		this.modelsDir = modelsDir;
		this.reportsDir = reportsDir;
		this.modelLocation = modelLocation;
		this.evlConstraints = evlConstraints;
		generateReport();
	}
	
	public void generateReport() {
		
		// Configure our destination file
		String destFile =  modelLocation.replace(modelsDir, reportsDir).replace(".etl.model", "") + ".xls";
		
		System.out.println("Generating report: " + destFile);
		
		// Copy the template file and read the spreadsheet that needs to be updated
		FileInputStream fsIP = null;
		HSSFWorkbook workbook = null;
		
		try {
			new File(destFile).createNewFile();
			copyFileUsingStream(new File(reportsDir + "/report_template.xls"), new File(destFile));
			fsIP = new FileInputStream(new File(destFile));
			workbook = new HSSFWorkbook(fsIP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Access the worksheet, so that we can update it. 
		HSSFSheet sheet = workbook.getSheetAt(0); 
		
		// For bold cells
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont boldFont = workbook.createFont();
        boldFont.setFontHeightInPoints((short) 10);
        boldFont.setFontName("Arial");
        boldFont.setBold(true);
        boldFont.setColor(IndexedColors.BLACK.getIndex());
        boldFont.setItalic(false);
        style.setFont(boldFont);
        
        // Now add them        
        for (short i = 1; i <= TOTAL_CODES; i++)
        {
        	// TODO CAMBIAR EL 1 POR 0
        	HashMap<Integer, Integer> ocurrencesMap = new HashMap<Integer, Integer>();
        	for (int c = 0; c < evlConstraints.size(); c++)
			{
	        	String message = evlConstraints.get(c);
				int codeNumber = Integer.parseInt(message.substring(1, 3));
				
				if (!message.contains("- Lines:") || i != codeNumber)
					continue;
				
				// Definir el string a agregar y ponerlo en la salida
				String[] lines = message.split("- Lines:")[1].trim().split("/");
				String newCellValue = "Entre las lineas " + lines[0] + " y " + lines[1];
				
				// La celda del numero
				Cell currentCell = sheet.getRow(codeNumber).getCell(3);
				
				if (currentCell == null || currentCell.getCellType() == Cell.CELL_TYPE_BLANK)
					sheet.getRow(codeNumber).createCell(3).setCellValue(1);
				else
					currentCell.setCellValue(currentCell.getNumericCellValue() + 1);
				
				// Verificar si la celda de ocurrencias en lineas es nueva o ya existe
				currentCell = sheet.getRow(codeNumber).getCell(4);
				
				if (currentCell == null || currentCell.getCellType() == Cell.CELL_TYPE_BLANK)
				{
					sheet.getRow(codeNumber).createCell(4).setCellValue("1. " + newCellValue);
					ocurrencesMap.put(codeNumber, 1);
				}
				else
				{
					int ocurrences = ocurrencesMap.get(codeNumber) + 1;
					newCellValue = currentCell.getStringCellValue() + "\n" + ocurrences + ". " + newCellValue;
					currentCell.setCellValue(newCellValue);
					ocurrencesMap.put(codeNumber, ocurrences);
				}
			}
        }
		
        //Close the InputStream  
        try {
			fsIP.close();
	      	FileOutputStream output_file = new FileOutputStream(new File(destFile)); 
	      	workbook.write(output_file);
	      	output_file.close();
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
}
