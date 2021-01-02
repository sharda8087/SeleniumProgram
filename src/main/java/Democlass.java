import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Democlass {
	
	 WebDriver driver;

	 @BeforeClass
	 public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/home");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 
	 @Test
	public void printtext() {
		
		String element = driver.findElement(By.xpath("/html/body/main/section[1]/div[1]/h1")).getText();
		
		System.out.println("Actual String - " +element);
	    
		String expected = "Welcome to your professional community";
		
		Assert.assertEquals(element, expected);
		
		if(element.equals("Welcome to your professional community"))
		{
			System.out.println("expected result");
		}
		else {
			System.out.println("unexpected result");
		}

	}
	 
	 @AfterClass
	 public void closeBrowser() {
		 driver.quit();
	 }

}
