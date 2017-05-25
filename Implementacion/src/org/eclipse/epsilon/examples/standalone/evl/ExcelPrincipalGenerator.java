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
public class ExcelPrincipalGenerator {
	
	/**
	 * An instance of EvlStandaloneExample
	 */
	private EvlStandaloneExample evl;
	
	/**
	 * The total number of bad smells in the catalog
	 */
	private final static int TOTAL_CODES = 10;
	
	/**
	 * EXCEL_FILE is the name of the generated XLS file with the report.
	 */
	private final static String EXCEL_FILE = "report.xls";
	
	/**
	 * ArrayList with all our project data
	 */
	private ArrayList<Dato> datosProyectos;
	
	/**
	 * REPOSITORY_PATH is the beggining of the url pointing to the file in the repository
	 */
	private final static String REPOSITORY_PATH = "https://github.com/NicolasBonet/ETLMetricsDataset/blob/master";
	
	public ExcelPrincipalGenerator(EvlStandaloneExample evlStandaloneExample, ArrayList<Dato> datosProyectos)
	{
		this.evl = evlStandaloneExample;
		this.datosProyectos = datosProyectos;
		
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
		Sheet sheet = workbook.cloneSheet(workbook.getSheetIndex("Main"));
		
		 // For bold cells
		CellStyle style = workbook.createCellStyle();
        Font boldFont = workbook.createFont();
        boldFont.setFontHeightInPoints((short) 10);
        boldFont.setFontName("Arial");
        boldFont.setBold(true);
        boldFont.setColor(IndexedColors.BLACK.getIndex());
        boldFont.setItalic(false);
        style.setFont(boldFont);
        
        String[] dataMetrics = {"lazy", "hwc", "hnc", "if", "iterators", "vars", "operationsperrule", "lazyperrule", "uselessoperations", "uselessparameters"};
		
		// Agregar los parsed models
		for (int i = 0; i < datosProyectos.size(); i++)
		{
			Dato proyecto = datosProyectos.get(i);
			
			System.out.println(proyecto.getName() + " - " + proyecto.getCategory());
			
			Row row = sheet.createRow(i + 1);
			Cell cell = row.createCell(0);
			cell.setCellValue(proyecto.getName());
			cell.setCellStyle(style);
			row.createCell(1).setCellValue(proyecto.getCategory());
			row.createCell(2).setCellValue(proyecto.getMetrics().get("loc"));
			row.createCell(4).setCellValue(proyecto.getMetrics().get("rules") - proyecto.getMetrics().get("lazy"));
			row.createCell(6).setCellFormula("F" + (i + 2) + "-H" + (i + 2));
			
			int columnNumber = 5;
			for (; columnNumber < dataMetrics.length + 5; columnNumber++)
			{
				row.createCell(columnNumber).setCellValue(proyecto.getMetrics().get(dataMetrics[columnNumber - 5]));
			}
			
			// Now add ocurrences!
			int[] badSmells = new int[TOTAL_CODES + 1];
			int totalBadSmells = 0;
			
			for (int c = 0; c < proyecto.getBadSmells().size(); c++)
			{
				int codeNumber = Integer.parseInt(proyecto.getBadSmells().get(c).substring(1, 3));
				badSmells[codeNumber - 1]++;
				totalBadSmells++;
			}
			
	        for (int code = 1; code <= TOTAL_CODES; code++)
	        {
	        	row.createCell(columnNumber + code - 1).setCellValue(badSmells[code - 1]);
	        }
	        
	        // Fix total of smells
	        row.createCell(3).setCellValue( totalBadSmells );
		}
		
		// Remove first sheet
		workbook.setSheetName(1, "Datos");
		workbook.removeSheetAt(0);
		
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
	
	private String getExcelColumnName(int columnNumber)
	{
	    int dividend = columnNumber;
	    String columnName = "";
	    int modulo;

	    while (dividend > 0)
	    {
	        modulo = (dividend - 1) % 26;
	        char c = (char) (65 + modulo);
	        columnName = c + columnName;
	        dividend = (int)((dividend - modulo) / 26);
	    } 

	    return columnName;
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
