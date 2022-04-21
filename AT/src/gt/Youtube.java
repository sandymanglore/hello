package gt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	
		// TODO Auto-generated method stub
		static    WebDriver driver ;
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
			driver=new ChromeDriver();
			//driver.get("https://www.youtube.com/watch?v=NAnYJcb0G40&t=297s");
			///Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
			String url = "https://www.tutorialspoint.com/index.htm";
		      driver.get(url);
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      // identify image
		      WebElement l =driver.findElement(By.xpath("//img[@title='Tutorialspoint']"));
		      //getAttribute() to get src of image
		      System.out.println("Src attribute is: "+ l.getAttribute("src"));
		      driver.quit();
		   }
		
	}

