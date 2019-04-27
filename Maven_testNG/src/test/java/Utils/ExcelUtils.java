package Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	
	public ExcelUtils( String excelPath, String sheetName)
	{
		try {
		File file = new File(excelPath);
		FileInputStream inputStream = new FileInputStream(file);
		workbook = new HSSFWorkbook(inputStream);
	    sheet =workbook.getSheet(sheetName);
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		getRowcount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}

	public static int getRowcount()
	{
		int rowCount=0;
		try{
			
			rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println("rowCount=" +rowCount);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());

			System.out.println( exp.getCause());
			exp.printStackTrace();

		}
		return rowCount;
	
	}
	
	
	public static int getColcount()
	{
		int colCount=0;
		
		try{
			
			colCount =sheet.getRow(0).getPhysicalNumberOfCells();
					System.out.println("colCount=" +colCount);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());

			System.out.println( exp.getCause());
			exp.printStackTrace();

		}
		return colCount;
		
	}
	public static String getCellDataString( int rowNum, int colNum)
	{
		String cellData=null;
		try {
			
		 cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("cellData=" +cellData);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());

			System.out.println( exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
		public static void getCellDataNumber(int rowNum, int colNum)
		{
			try {

				double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				//System.out.println("cellData=" +cellData);
			}
			catch (Exception exp) {
				System.out.println( exp.getMessage());

				System.out.println( exp.getCause());
				exp.printStackTrace();
			}

		}
	}
