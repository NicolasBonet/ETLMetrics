package co.edu.uniandes.badSmellsChecker.evl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
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
public class ExcelGenerator {
	
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
	private final static int TOTAL_CODES = 11;
	
	/**
	 * EXCEL_FILE is the name of the generated XLS file with the report.
	 */
	private final static String EXCEL_FILE = "report.xls";
	
	/**
	 * ArrayList with all our evlConstraints
	 */
	private HashMap<File, ArrayList<String>> evlConstraints;
	
	/**
	 * The current category we are handling
	 */
	private String category;
	
	/**
	 * REPOSITORY_PATH is the beggining of the url pointing to the file in the repository
	 */
	private final static String REPOSITORY_PATH = "https://github.com/NicolasBonet/ETLMetricsDataset/blob/master";
	
	public ExcelGenerator(String reportsDir, String modelsDir, HashMap<File, ArrayList<String>> evlConstraints, String category)
	{
		this.modelsDir = modelsDir;
		this.reportsDir = reportsDir;
		this.evlConstraints = evlConstraints;
		this.category = category;
		generateReport();
	}
	
	public void generateReport() {
		
		// Configure our destination file
		String destFile =  reportsDir + "/" + category + ".xls";
		
		System.out.println("Generating report: " + destFile);
		
		// Excel workbook
		HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("FirstSheet");
        
        // For bold cells
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont boldFont = workbook.createFont();
        boldFont.setFontHeightInPoints((short) 10);
        boldFont.setFontName("Arial");
        boldFont.setBold(true);
        boldFont.setColor(IndexedColors.BLACK.getIndex());
        boldFont.setItalic(false);
        style.setFont(boldFont);
        
        // Set our current row to the first one
        short currentRow = (short) 0;
        
        // First row includes all projects and bad smells codes.
        HSSFRow rowhead = sheet.createRow(currentRow++);
        HSSFCell cell = rowhead.createCell(0);
        cell.setCellValue("Project \\ Bad Smell Code");
        cell.setCellStyle(style);
        
        // Print the first row of codes
        for (int i = 1; i <= TOTAL_CODES; i++)
        {
        	cell = rowhead.createCell(i);
        	
        	if (i < 10)
        		cell.setCellValue("0" + i);
        	else
        		cell.setCellValue(i);
        	
            cell.setCellStyle(style);
        }
        
        // Now the total
        rowhead.createCell(TOTAL_CODES + 1).setCellValue("Bad Smells Found");

        // Time to set the output per project
        for (File file : evlConstraints.keySet())
		{
			// Create the row for each ETL
			HSSFRow row = sheet.createRow(currentRow++);
	        row.createCell(0).setCellValue(file.getName());
	        
	        // Array of constraints
			ArrayList<String> modelFileConstraints = evlConstraints.get(file);
	        
			// Now add ocurrences!
			int[] badSmells = new int[TOTAL_CODES + 1];
			int totalSmells = 0;
			
			for (int c = 0; c < modelFileConstraints.size(); c++)
			{
				int codeNumber = Integer.parseInt(modelFileConstraints.get(c).substring(1, 3));
				badSmells[codeNumber - 1]++;
			}
			
	        for (int code = 1; code <= TOTAL_CODES; code++)
	        {
	        	row.createCell(code).setCellValue(badSmells[code - 1]);
	        	totalSmells += badSmells[code - 1];
	        }
	        
	        // The total
	        row.createCell(TOTAL_CODES + 1).setCellValue(totalSmells);
		}
		
		// Line of total ocurrences
		HSSFRow row = sheet.createRow(currentRow++);
        row.createCell(0).setCellValue("Total ocurrences");
        
        for (int code = 1; code <= (TOTAL_CODES + 1); code++)
        {
        	char letter = (char) (code + 65);
        	cell = row.createCell(code);
        	cell.setCellType(HSSFCell.CELL_TYPE_FORMULA);
        	cell.setCellFormula("SUM(" + letter + "2:" + letter + (currentRow - 1) + ")");
        }
        
        // Empty row!
        row = sheet.createRow(currentRow++);
        row.createCell(0).setCellValue("");
        
        // Process graph for each model
        int i = 0;
        for (File file : evlConstraints.keySet())
        {
        	row = sheet.createRow(currentRow++);
            row.createCell(0).setCellValue("");
            
            row = sheet.createRow(currentRow++);
            row.createCell(0).setCellValue("");
            
            row = sheet.createRow(currentRow++);
            cell = row.createCell(0);
            cell.setCellValue(file.getName());
            cell.setCellStyle(style);
            
            row = sheet.createRow(currentRow++);
            cell = row.createCell(0);
            cell.setCellValue("Bad Smell Code");
            cell.setCellStyle(style);
            cell = row.createCell(1);
            cell.setCellValue("Ocurrences");
            cell.setCellStyle(style);
            cell = row.createCell(2);
            cell.setCellValue("%");
            cell.setCellStyle(style);
            
            // Array of constraints
 			ArrayList<String> modelFileConstraints = evlConstraints.get(file);
 	        
 			// Now add ocurrences!
 			int[] badSmells = new int[TOTAL_CODES + 1];
 			
 			for (int c = 0; c < modelFileConstraints.size(); c++)
 			{
 				int codeNumber = Integer.parseInt(modelFileConstraints.get(c).substring(1, 3));
 				badSmells[codeNumber - 1]++;
 			}
 			
 	        for (int code = 1; code <= TOTAL_CODES; code++)
 	        {
 	        	row = sheet.createRow(currentRow++);
 	        	
 	        	if (i < 10)
 	        		row.createCell(0).setCellValue("0" + code);
 	        	else
 	        		row.createCell(0).setCellValue(code);
 	        	
 	        	row.createCell(1).setCellValue(badSmells[code - 1]);
 	        	row.createCell(2).setCellValue(badSmells[code - 1]);
 	        }
 	        
 	        i++;
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
}
