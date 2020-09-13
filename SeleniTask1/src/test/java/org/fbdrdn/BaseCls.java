package org.fbdrdn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseCls {

	static WebDriver driver1;
	
	public static void launchUrl(String url) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.get(url);
		
	}
	
	public static void clickFunc(WebElement ele) {
		ele.click();

	}
	
	
	public static void jsClick(WebElement w, String s) {
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript(s, w);

	}
	
	public static void dropDown(WebElement w, String selBV, String selBVT,String selBI) {
	Select s = new Select(w);
	if (selBV!=null) {
		
		s.selectByValue(selBV);
	}
	else if (selBVT!=null) {
		s.selectByVisibleText(selBVT);
		
	}
	else if (selBI!=null) {
		int ind = Integer.parseInt(selBI);
		s.selectByIndex(ind);
	}
	else {
		System.out.println("Dropdown not working properly");
	}
		
	}
	
	
}
