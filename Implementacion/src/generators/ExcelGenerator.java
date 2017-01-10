package generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.IndexedColors;

import co.edu.uniandes.badSmellsIdentifier.ProjectsAnalyzer;

/**
 * This class generates an excel file called report.xls with a report of all the statements found in the ETL Project
 * set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class ExcelGenerator {
	
	private ProjectsAnalyzer projectsAnalyzer;
	
	private final static int TOTAL_CODES = 23;
	
	/**
	 * This is our constructor
	 */
	public ExcelGenerator()
	{
		projectsAnalyzer = new ProjectsAnalyzer();
	}
	
	public void generateReport() {
		
		// Generate
		String filename = "./report.xls";
		
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
		for (int i = 0; i < projectsAnalyzer.getModelFiles().size(); i++)
		{
			// Create the row for each ETL
			HSSFRow row = sheet.createRow(currentRow++);
	        row.createCell(0).setCellValue(projectsAnalyzer.getModelFiles().get(i).getName());
	        
	        // Array of constraints
			ArrayList<String> modelFileConstraints = projectsAnalyzer.getEvlConstraints().get(projectsAnalyzer.getModelFiles().get(i));
	        
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
        for (int i = 0; i < projectsAnalyzer.getModelFiles().size(); i++)
        {
        	row = sheet.createRow(currentRow++);
            row.createCell(0).setCellValue("");
            
            row = sheet.createRow(currentRow++);
            row.createCell(0).setCellValue("");
            
            row = sheet.createRow(currentRow++);
            cell = row.createCell(0);
            cell.setCellValue(projectsAnalyzer.getModelFiles().get(i).getName());
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
 			ArrayList<String> modelFileConstraints = projectsAnalyzer.getEvlConstraints().get(projectsAnalyzer.getModelFiles().get(i));
 	        
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
        }
		
		// Generate Excel file.
		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
	        fileOut.close();
	        workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		// Log it
        projectsAnalyzer.logLine("The excel report has being generated at " + new File(filename).getAbsolutePath());
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		ExcelGenerator excelGenerator = new ExcelGenerator();
		excelGenerator.generateReport();
	}
}
