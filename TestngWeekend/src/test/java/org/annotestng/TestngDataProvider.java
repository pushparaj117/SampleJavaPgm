package org.annotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider {
	
	@DataProvider(name="credential")
	public Object[][] dataProv() {
		return new Object[][] {
			{"user1","122344"},
			{"user2","144344"},
			{"user3","177344"}
			
		};	

	}
	
	@Test(dataProvider = "credential")
	public void loginDetails(String user, String pass) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PUSHPARAJ\\eclipse-workspace\\TestngWeekend\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
		WebElement userField = driver.findElement(By.id("username"));
		userField.sendKeys(user);
		
		WebElement passField = driver.findElement(By.id("password"));
		passField.sendKeys(pass);
		
		

	}
	
	
	

}
