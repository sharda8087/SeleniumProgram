package com.handlewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("promtButton"));
		  element.click();
		  Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("argument[0].click()", element);
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
	}

}
