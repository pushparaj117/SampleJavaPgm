package org.sel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskPract {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		List<WebElement> allPhone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("Number of All Products displaying :" +allPhone.size());
		for (WebElement each : allPhone) {
			
			System.out.println(each.getText());
		}
		List<String> dispProduct = new ArrayList<String>();
		List<String> duplicateProduct = new ArrayList<String>();
		
		for (WebElement eachEle : allPhone) {
			
			if (!dispProduct.contains(eachEle.getText())) {
				
				dispProduct.add(eachEle.getText());
				
			}
			else {
				duplicateProduct.add(eachEle.getText());
			}
			
		}
		System.out.println();
		System.out.println("Number of duplicate product displaying :"+duplicateProduct.size());
		System.out.println();
		for (String x : duplicateProduct) {
			
			System.out.println("Name of the duplicate product :"+x);
		}
	}
	


}
