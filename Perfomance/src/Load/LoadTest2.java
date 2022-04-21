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

public class LoadTest2 {
static WebDriver driver;
static ExtentReports report;
static ExtentTest test;
@BeforeTest

public static void projectsetup() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
	driver = new ChromeDriver();	
	
}
//@Test(priority=0)
//public static void report() {
	//report=new ExtentReports("./agfa./mar2.html");
	 //test=report.startTest("test01","AGFA-login");

	@DataProvider(name="AFGALOGIN")
public static Object[][]AGFADATALOGIN(){
		
	return new Object[][]{{"111233454676879780"},{"111233454676879780"}};
	}
		
@Test(dataProvider="AFGALOGIN")
public static void TestcaseAFGA(String password) throws InterruptedException {
	
	driver.get("https://qawebapp.agfamic.com:38081/patview_agfa/#/auth/login/identificationnum");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identificatin_no']")).sendKeys(password);
   Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@id='chbox']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
}
	
@AfterTest
public static void close()
{
	driver.close();
}

}
