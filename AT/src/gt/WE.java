package gt;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WE {
	static    WebDriver driver ;
	static ExtentReports report;
	static ExtentTest test;
	static ExpectedConditions elementToBeClickable;
 
     
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
		driver=new ChromeDriver();
			// TODO Auto-generated method stub
		 report=new ExtentReports("./sandy./aug10.html");
	   
	   
	     test= report.startTest("test01", "mangalore tourisam");
	     
	     driver.get("https://www.karnatakatourism.org/tour-item/tannirbhavi-beach/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     WebElement ele= driver.findElement(By.xpath("//span[text()='Gallery']"));
	     
	     Actions sa= new Actions(driver);
	     sa.moveToElement(ele).perform();
	     Thread.sleep(3000);
	    	driver.findElement(By.xpath("//li[@id='nav-menu-item-9992']")).click();	 
	    	 Thread.sleep(3000);
	    	 
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("window.scrollBy(0,1235)","");
	    	 Thread.sleep(3000);
	    	 
	    	driver.findElement(By.xpath("//a[@class='mkdf-search-opener mkdf-icon-has-hover']")).click();
	    	 Thread.sleep(3000);
	    	 
	    	 driver.findElement(By.xpath("//input[@class='mkdf-search-field']")).sendKeys(" beach");
		    	Thread.sleep(3000);
		    	 
		    	driver.findElement(By.xpath("//button[@class='mkdf-search-submit']")). click();
		    	 //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    	
		    	Thread.sleep(5000);
		    	
		    	//WebDriverWait wait=new WebDriverWait(driver, 30); 
		    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='mkdf-search-field']"))).click();
		    	 
		    //	WebElement element1 =
		    	driver.findElement(By.xpath("//input[@placeholder='Type here']")).click();
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("//input[@placeholder='Type here']")).sendKeys("beach");
		    	
		    	//JavascriptExecutor executor = (JavascriptExecutor)driver;
		    	//executor.executeScript("arguments[0].click();", element1);
		    //	element1.click();
		    	//driver.findElement(By.className("mkdf-search-field")).sendKeys("beach");
		     	//driver.findElement(By.xpath("//input[@class='mkdf-search-field']")).sendKeys(" beach");
		    	Thread.sleep(3000);
		    	 
		    	driver.findElement(By.xpath("//span[@class='icon_search']")). click();
		    	Thread.sleep(3000);
		    	 
		    	driver.findElement(By.xpath("//span[text()='Home']")). click();
		    	Thread.sleep(3000);
		    	
		    //	driver.findElement(By.xpath("//body/div[@id='sgpb-popup-dialog-main-div-wrapper']/div[1]/img[1]")). click();
		    	driver.findElement(By.xpath("//img[@class='sgpb-popup-close-button-6']")). click();
	     report.endTest(test);
	     report.flush();
	}
}
