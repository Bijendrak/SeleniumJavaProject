package Utils;

public class class_Excel_Utils {

	public static void main(String[] args) {
		ExcelUtils excel= new ExcelUtils(System.getProperty("user.dir")+"/excel/Excel sheet.xls", "Sheet1");
		excel.getRowcount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);

	}

}
