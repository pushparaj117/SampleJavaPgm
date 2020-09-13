package org.sel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIphoneAscend {
	
	public static void main(String[] args) {
		ArrayList<Integer> intValue = new ArrayList<Integer>();
		Set<String> empSet = new TreeSet<String>();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\SeleniTask1\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (WebElement y : priceList) {
			String text = y.getText();
			String onlyPrice = text.replaceAll("[^0-9]", "");
			
			int priceNumber = Integer.parseInt(onlyPrice);
			intValue.add(priceNumber);
		 
		 }
		System.out.println("Ascending order of price's in the search page :");
		Collections.sort(intValue);
		for (Integer w : intValue) {
			
			System.out.println(w);
		}
	}
	
	

}
