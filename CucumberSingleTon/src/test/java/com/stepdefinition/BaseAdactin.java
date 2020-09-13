package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseAdactin  {
	
	
public static WebDriver driver;
public static String myOrderId;
	
	public static WebDriver launchApp() {
		if (driver==null) {
			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\CucumberTask\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		return driver;
		}
	
	public void urlPass(String s) {
		driver.get(s);

	}	
	
	public static void fill(WebElement w,String s) {
		
		w.sendKeys(s);
	}
	
	public static void klick(WebElement w) {
		 w.click();  
	}

	public static void drdn(WebElement w,String str) throws InterruptedException {
		Select s=new Select(w);
//		Thread.sleep(3000);
		s.selectByVisibleText(str);

	}
	
	public static void getAtrri(WebElement ele) {
		
		myOrderId = ele.getAttribute("value");
		System.out.println("My Order Id :" +myOrderId);
		
	}
	
	public void alertHandle() {
		Alert a = driver.switchTo().alert();
		a.accept();
	
	}
	
	public static void getQuit() {
		
		driver.quit();

	}


}
