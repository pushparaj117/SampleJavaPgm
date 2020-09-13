package org.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniSelectTask {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		WebElement dayTab = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement monthTab = driver.findElement(By.id("month"));
		WebElement yearTab = driver.findElement(By.id("year"));
		
		Select s1= new Select(dayTab);
		Select s2= new Select(monthTab);
		Select s3 = new Select(yearTab);
		if (!s1.isMultiple()) {
			s1.selectByIndex(17);
			WebElement firstSelectedOption = s1.getFirstSelectedOption();
			String date = firstSelectedOption.getText();
			System.out.println(date);
		}
		if (!s2.isMultiple()) {
			s2.selectByValue("7");
			WebElement secondSelectedOption = s2.getFirstSelectedOption();
			String mon = secondSelectedOption.getText();
			System.out.println(mon);
		}
		if (!s3.isMultiple()) {
			s3.selectByVisibleText("1991");
			WebElement thirdSelectedOption = s3.getFirstSelectedOption();
			String year = thirdSelectedOption.getText();
			System.out.println(year);
		}
		

		
		
		
	}

}
