package Utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider2_TestNGAnnotation {
	
    @Test(dataProvider = "test1Data")
	public void test1(String username, String password)
	{
		//System.out.println(username+" "+password);
	}
    
	@DataProvider(name= "test1Data")
	public Object[][] getData()
	{
		String excelPath="C:\\Users\\mindfire\\eclipse-workspace\\Maven_testNG\\excel\\Excel sheet.xls";
		Object data[][]=testData(excelPath,"Sheet1");
		return data;
	}
	
 public Object[][] testData(String excelPath,String sheetName)
 {
	 ExcelUtils excel= new ExcelUtils(excelPath, sheetName);
	 int rowCount=excel.getRowcount();
	 int colCount=excel.getColcount();
	 
	 Object data[][]=new Object[rowCount-1][colCount];
	 
	 
	 for(int i=1;i<rowCount;i++)
	 {
		 for(int j=0;j<colCount;j++)
		 {
			String cellData= excel.getCellDataString(i, j);
			System.out.print(cellData+" ");
			data[i-1][j]=cellData;
		 }System.out.println();
	 }System.out.println();
	 return data; 
 }
	}


