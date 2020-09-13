package org.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
static WebDriver driver;
	
	public static void launchApp(String s) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\CucumberTask\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
		}
	
	public static void fill(WebElement w,String s) throws InterruptedException {
		Thread.sleep(3000);
		w.sendKeys(s);
	}
	
	public static void klick(WebElement w) {
		 w.click();  
	}

	public static void drdn(WebElement w,String str) {
		Select s=new Select(w);
		s.selectByVisibleText(str);

	}
	
	public static void getAtrri(WebElement ele) {
		
		String myOrderId = ele.getAttribute("value");
		System.out.println("My Order Id :" +myOrderId);
		
	}
	

}
