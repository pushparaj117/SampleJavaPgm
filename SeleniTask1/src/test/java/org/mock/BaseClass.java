package org.mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass{

	public static WebDriver driver;

	public static WebDriver launchApp(String url) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PUSHPARAJ\\eclipse-workspace\\CucumberTask\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			
			return driver;

	}

	public static void clck(WebElement w) {
		w = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		w.click();
	}

	public static void drdn(WebElement w, String selByVt, String selByVal, String selByIndex) throws InterruptedException {
		Select s = new Select(w);

		if (selByVt!=null) {
			s.selectByVisibleText(selByVt);
		}
		else if (selByVal!=null) {
			s.selectByValue(selByVal);
		}
		else if (selByIndex!=null) {
			int index = Integer.parseInt(selByIndex);
			s.selectByIndex(index);
			
		}
		else {
			System.out.println("Dropdown is not selected properly");
		}

	}
	

}
