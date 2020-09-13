package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelGoIbobo {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//a[@data-action-id='c81994ec']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("chennai");
		Thread.sleep(8000);
		Robot rc =  new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("delhi");
		Thread.sleep(8000);
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='fare_20200824']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='fb button orange large ht55 fltHpySrchBtn']")).click();
		Thread.sleep(15000);
		List<WebElement> searchResult = driver.findElements(By.xpath("//span[@class='ico13 padR10 padL5']"));
		Thread.sleep(5000);
		System.out.println("Number of All Flight displaying :" +searchResult.size());
		List<String>origiFlight = new ArrayList<String>();
		TreeSet<String> dupliFlight = new TreeSet<String>();
		Thread.sleep(5000);
		for (WebElement x : searchResult) {
//			Thread.sleep(5000);
//			System.out.println(x.getText());
			if(!origiFlight.contains(x.getText())) {
//				Thread.sleep(5000);
				origiFlight.add(x.getText());
								
			}
			else {
//				Thread.sleep(5000);
				dupliFlight.add(x.getText());
			}
		
			for (String z : origiFlight) {
//				Thread.sleep(5000);
				System.out.println(z);
			}
			
		}

//		Thread.sleep(5000);
		System.out.println("Number of Duplicate Flight :" +dupliFlight.size());
//		Thread.sleep(5000);
		for (String y : dupliFlight) {
//			Thread.sleep(5000);
			System.out.println("Name of the duplicate flight name :" +y );
			
		}
		
		
	}

}
