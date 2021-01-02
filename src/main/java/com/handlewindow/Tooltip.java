package com.handlewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Tooltip {
	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		
		driver.manage().window().maximize();
		
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[5]"));
		 element.click();
		
		Actions act = new Actions(driver);
		
		 //driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[5]"));
		
		act.moveToElement(element).perform();
		
		String tooltipMsg = element.getText();
		
		System.out.println("tooltip message" +tooltipMsg);
		
		String expected = "JavaScript Tutorial";
		
		Assert.assertEquals(tooltipMsg, expected);
		
		System.out.println("Message Verified");
		
		
		driver.quit();
	}
	
	
	

}
