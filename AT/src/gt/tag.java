package gt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class tag {
	static    WebDriver driver ;
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
			driver=new ChromeDriver();
			
			https://demo.guru99.com/test/newtours/
				  
			     driver.get("https://demo.guru99.com/test/newtours/");
			
			List<WebElement> ObjectLink =driver.findElements(By.tagName("a"));
			for (WebElement obk: ObjectLink) {
				String Text= obk.getText();
				System.out.println(Text);
			} 
		}
}
