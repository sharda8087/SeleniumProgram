import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLEngineResult.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookDropdown {
	WebDriver driver;
	
	
	@Test
	public void checkboxAndRadio() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //implicit wait
		
		// Clicking on radio button
		 WebElement M_radiobutton = driver.findElement(By.id("u_0_a"));
		  boolean status = M_radiobutton.isDisplayed();
		System.out.println("Male radio button is displayed " +status);
		
		boolean enabled = M_radiobutton.isEnabled();
		System.out.println("Male radio button is Enabled " +enabled);
		
		boolean selected = M_radiobutton.isSelected();
		System.out.println("Male radio button is selected " +selected);
		
	      M_radiobutton.click();
	      
	      boolean isselectednew = M_radiobutton.isSelected();
	      System.out.println("Male radio button is selected " +isselectednew);
		
	      
	      driver.quit();
		
	}

	
}
