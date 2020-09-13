package org.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ISelect;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AutomateApp extends Base {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities des= new DesiredCapabilities();
		des.setCapability("deviceName", "OnePlus 6");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "10");
		des.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		des.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, des);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<MobileElement> conBtn = driver.findElements(By.id("in.amazon.mShop.android.shopping:id/sso_continue"));
		if(isElementPresent(conBtn)) {
			conBtn.get(0).click();
			
		}	
		
		MobileElement txtBox = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text"));
		txtBox.sendKeys("iPhone");
		txtBox.click();
		MobileElement res = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
		res.click();
		MobileElement selIphone = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Apple iPhone 11 (64GB) - Black 4.5 out of 5 stars 4,399 ₹68,300 Up to INR 5000 off on HDFC Bank cards. Amazon Prime FREE Delivery by Thursday, August 20\"]/android.view.View[1]"));
		selIphone.click();
		List<MobileElement> allowAcc = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
		
		if(isElementPresent(allowAcc)) {
			allowAcc.get(0).click();
			
		MobileElement allowBtn = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allowBtn.click();	
			
		}
		//size
		Dimension size = driver.manage().window().getSize();
		Double pointHeight = size.getHeight() * 0.5;
		Double endPointHeight = size.getHeight() * 0.2;
		
		int startPoint = pointHeight.intValue();
		int endPoint = endPointHeight.intValue();
		
		// swipe up
		
		TouchAction acc = new TouchAction(driver);
		
		acc.press(PointOption.point(10, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(10, endPoint)).release().perform();
			
		Thread.sleep(5000);
		acc.press(PointOption.point(10, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(10, endPoint)).release().perform();
		Thread.sleep(5000);
		acc.press(PointOption.point(10, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(10, endPoint)).release().perform();
		
		MobileElement qty = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]"));
		qty.click();
		MobileElement qtySelect = driver.findElement(By.xpath("//android.view.View[@content-desc=\"4\"]"));
		qtySelect.click();
		
		acc.press(PointOption.point(10, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(10, endPoint)).release().perform();
		
		MobileElement buyOpt = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View"));
		buyOpt.click();
		
		//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"3\"]")).click();
		
		
	}
	
	

}
