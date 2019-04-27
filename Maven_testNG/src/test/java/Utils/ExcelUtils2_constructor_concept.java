package Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils2_constructor_concept {

	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	
	
	public static void main(String args[])
	{
		//getRowcount();
		getCellDataString();
		getCellDataNumber();

	}

	public static void getRowcount()
	{
		try{
			File file = new File(System.getProperty("user.dir")+"/excel/Excel sheet.xls");
			FileInputStream inputStream = new FileInputStream(file);
			workbook = new HSSFWorkbook(inputStream);
			HSSFSheet sheet =workbook.getSheet("Sheet1");
			int rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println("rowCount=" +rowCount);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());

			System.out.println( exp.getCause());
			exp.printStackTrace();

		}
	}
	public static void getCellDataString( int rowNum, int colNum)
	{
		try {

			File file = new File(System.getProperty("user.dir")+"/excel/Excel sheet.xls");
			FileInputStream inputStream = new FileInputStream(file);
			workbook = new HSSFWorkbook(inputStream);
			HSSFSheet sheet =workbook.getSheet("Sheet1");
			String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("cellData=" +cellData);
		}
		catch (Exception exp) {
			System.out.println( exp.getMessage());

			System.out.println( exp.getCause());
			exp.printStackTrace();
		}
	}
		public static void getCellDataNumber(int rowNum, int colNum)
		{
			try {

				File file = new File(System.getProperty("user.dir")+"/excel/Excel sheet.xls");
				FileInputStream inputStream = new FileInputStream(file);
				workbook = new HSSFWorkbook(inputStream);
				HSSFSheet sheet =workbook.getSheet("Sheet1");
				double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				System.out.println("cellData=" +cellData);
			}
			catch (Exception exp) {
				System.out.println( exp.getMessage());

				System.out.println( exp.getCause());
				exp.printStackTrace();
			}

		}
	}
