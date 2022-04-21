package Load;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;




public class LoadTest {
	
 static WebDriver driver;
static ExtentReports report;
static ExtentTest test;
		@Test(invocationCount = 1)
		      public static void loadTesting() throws InterruptedException
		      {
			 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
			 driver = new ChromeDriver(); 
		      

			//report=new ExtentReports("./amaz./mar02.html");
		//	test=report.startTest("test01","AGFA-login");
	
		
			// driver.get("https://qawebapp.agfamic.com:38081/patview_agfa/#/auth/login/identificationnum");

				driver.get("https://skintest.eastus.azurecontainer.io/unilever-skinsensor/#/dashboard");
				 //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin01@gmail.com");
			     //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abcd@1234");
			     //Thread.sleep(3000);

			    // driver.findElement(By.xpath("//button[text()='Login']")).click();
			    
			  System.out.println("Page Title is " + driver.getTitle());
		       Assert.assertEquals("Unilever Skin Sensor", driver.getTitle());
		       driver.quit();
		      }
}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 

	

