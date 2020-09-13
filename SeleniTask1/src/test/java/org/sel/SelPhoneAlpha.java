package org.sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelPhoneAlpha {
	
	public static void main(String[] args) {
		
		List<String> empString = new ArrayList<String>();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<WebElement> phoneName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (WebElement x : phoneName) {
			
			String ref = x.getText();
			empString.add(ref);
			
		}
		System.out.println("Phone result in Alphabetic order :");
		Collections.sort(empString);
		
		for (String y : empString) {
			System.out.println(y);
			
			
		}
		
		
	}

}
