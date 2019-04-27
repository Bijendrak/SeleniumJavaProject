package Utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils_XLS_XLXS {

	public static void main(String args[])
	{
		getRowcount();

	}

	public static void getRowcount()
	{
		try{
			File file = new File(System.getProperty("user.dir")+"/excel/Excel sheet.xls");
		    FileInputStream inputStream = new FileInputStream(file);
		    HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
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
}
