import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependentTest {
	
	 WebDriver driver;
	/*
	 * @BeforeClass public void openBrowser() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe"
	 * ); driver = new ChromeDriver(); driver.get("https://www.linkedin.com/home");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 */
	 
	 @Test
	 public void testlogin() {
		 Assert.assertEquals("Selenium", "Selenium");
		 System.out.println("login done");
	 }
	 
	 @Test(dependsOnMethods = {"testlogin"})
	 public void TestAccount( ) {
		 System.out.println("account has been created");
	 }
	 
	 @Test(dependsOnMethods = {"testlogin","TestAccount"})
	 public void TestLogout() {
		 System.out.println("account has been loyout");
	 }
	 
	 
	/*
	 * @AfterClass public void closeBrowser() { driver.quit(); }
	 */

}
