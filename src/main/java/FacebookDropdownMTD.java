import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookDropdownMTD {
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority = 2)
	public void dropdownMethod() {
		
		WebElement element = driver.findElement(By.id("month"));
		
		Select month = new Select(element);
		
		WebElement first_value = month.getFirstSelectedOption();
		
		 String value = first_value.getText();
		
		System.out.println(value);
	
			
	}
	
	@Test(priority = 1)
	public void GetAllOption() {
		
		WebElement AllelementOfMonth = driver.findElement(By.id("month"));
		
		Select month = new Select(AllelementOfMonth);
		
		List<WebElement> dropdown = month.getOptions();
				
		for(int i = 0; i < dropdown.size(); i++) {
			 String allDropdownValues = dropdown.get(i).getText();
			 System.out.println("Dropdown values are--  " +allDropdownValues);
			 
		}
		
		
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
	}

}
