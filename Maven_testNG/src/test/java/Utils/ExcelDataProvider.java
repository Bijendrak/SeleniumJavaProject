package Utils;

public class ExcelDataProvider {
	public static void main(String[] args)
	{
	String excelPath="C:\\Users\\mindfire\\eclipse-workspace\\Maven_testNG\\excel\\Excel sheet.xls";
	testData(excelPath,"Sheet1");
	}

 public static Object[][] testData(String excelPath,String sheetName)
 {
	 ExcelUtils excel= new ExcelUtils(excelPath, sheetName);
	 int rowCount=excel.getRowcount();
	 int colCount=excel.getColcount();
	 
	 Object data[][]=new Object[rowCount-1][colCount-1];
	 
	 
	 for(int i=1;i<rowCount;i++)
	 {
		 for(int j=0;j<colCount;j++)
		 {
			String cellData= excel.getCellDataString(i, j);
			System.out.print(cellData+" ");
			data[i-1][j-1]=cellData;
		 }
	 }System.out.println();
	 return data; 
 }
	}


