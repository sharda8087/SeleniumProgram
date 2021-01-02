package com.handlewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	static WebDriver driver;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		
		//Opening all the child window
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main window handle is " +mainWindowHandle);
		
	    
		// To handle all new opened window
	     Set<String> allwindowhandle =  driver.getWindowHandles();
	     
	     System.out.println("child window handle is" +allwindowhandle);
	     
	     Iterator<String> i1 = allwindowhandle.iterator();
	     
	  // Here we will check if child window has other child windows and when child window
	     //is the main window it will come out of loop.
	     
	     while(i1.hasNext()) {
	    	 String ChildWindow = i1.next();
	    	 if(!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	    		 driver.switchTo().window(ChildWindow);
	    		 
	    		  WebElement text =driver.findElement(By.id("sampleHeading"));
	    		  
	    		  System.out.println("Heading of child window is " +text.getText());
	    	       driver.close();
	    	       System.out.println("Child window closed");
	    	 }
	    	 
	    	 
	    	 driver.switchTo().window(mainWindowHandle);
	    	 driver.quit();
	    	 
	     }
		
		
		
		
		
	}

}
