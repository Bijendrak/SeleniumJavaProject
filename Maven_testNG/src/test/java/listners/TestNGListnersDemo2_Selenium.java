package listners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.TestNGListners.class)
public class TestNGListnersDemo2_Selenium {
	WebDriver driver= null;

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver/chromedriver.exe" );
		driver =new ChromeDriver();
		driver.navigate().to("http://84.199.3.93");
		//wait for the element to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div:nth-child(2) > input")).sendKeys("tester04@mailinator.com");
		driver.findElement(By.cssSelector("#app-router-outlet > app-user-root > app-snoopstar-auth > section > div.col-xs-12.cp.mt-50 > div.col-xs-12.col-md-6.col-lg-5.offset-lg-1.cp.ng-trigger.ng-trigger-slide > app-snoopstar-login > div > form > div.col-xs-12.cp.pb-1 > input")).sendKeys("abc");
		
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This is skiped");
	}
}