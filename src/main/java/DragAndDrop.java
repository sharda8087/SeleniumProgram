import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowsr() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	}
	
	@Test(enabled = true)
	public void dragAnddrop() {
		
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
				action.dragAndDrop(drag, drop).build().perform();
		
	}
	
	@Test
	public void classA() {
		System.out.println("Shardha sharma is a good girl");
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
