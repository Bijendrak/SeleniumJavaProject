package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider2_TestNGAnnotation2_selenium {
	//Data driven selenium code
	
	WebDriver driver=null;
	
	
	
	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver/chromedriver.exe" );
		driver =new ChromeDriver();
		
	}
	
    @Test(dataProvider = "test1Data")
	public void test1(String username, String password)
	{
		System.out.println(username+" "+password);
		driver.navigate().to("http://84.199.3.93");
		//wait for the element to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div:nth-child(2) > input")).sendKeys(username);
		
		//enter password
		driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div.col-xs-12.cp.pb-1 > input")).sendKeys(password);
		
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


