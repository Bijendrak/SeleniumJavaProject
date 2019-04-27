package TestNG_package;


	import java.util.concurrent.TimeUnit;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class testNG_class {

		static WebDriver driver= null;

	     @BeforeTest
		public void setUpTest()
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver/chromedriver.exe" );
			driver =new ChromeDriver();


		}
	     @Test
		public void MYAR() {

			driver.get("http://google.com");
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div:nth-child(2) > input")).sendKeys("tester04@mailinator.com");

			//LoginPage.User_name(driver).sendKeys("tester04@mailinator.com");

			//enter password
			//driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div.col-xs-12.cp.pb-1 > input")).sendKeys("Mindfire@098");

			//LoginPage.password(driver).sendKeys("Mindfire@098");


			//Click on LOGIN button
			//driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div:nth-child(4) > span > input[type=\"submit\"]")).click();

			//Click on LOGIN button by pressing enter key
			//driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div:nth-child(4) > span > input[type=\"submit\"]")).sendKeys(Keys.RETURN);

			//LoginPage.button_click(driver).click();

		}
	     
	     @AfterTest
		public void tearDownTest()
		{
			driver.close();
			System.out.println("Success");
		}




}
