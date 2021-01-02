import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
  WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(src, new File("C:/selenium/" +System.currentTimeMillis()+".png"));
		}
		catch (IOException e) {
          System.out.println(e.getMessage());	
          }
		
		driver.quit();
	}
	
	

}
