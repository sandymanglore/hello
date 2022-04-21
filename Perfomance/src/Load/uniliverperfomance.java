package Load;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class uniliverperfomance {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeTest
	public static void projectsetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		driver = new ChromeDriver();	
		

	}
	@DataProvider(name="UniLogin")
	
	public static Object[][]UniDATALogin(){
		return new  Object[][] {{"admin01@gmail.com","Abcd@1234"}};
		
		
	}
	
	@Test(dataProvider="UniLogin") 
		public static void TestCaseUnilogin(String username ,String password) throws InterruptedException{
		
		driver.get("https://skintest.eastus.azurecontainer.io/unilever-skinsensor/#/dashboard");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	     Thread.sleep(5000);

	     driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

	@AfterTest
	public static void close(){
		driver.close();
	
	}}

