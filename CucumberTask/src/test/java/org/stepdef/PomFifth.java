package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFifth extends BaseClass{

	public PomFifth() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="logout")
	private WebElement logOut;
	
	@FindBy(id="order_no")
	private WebElement orderId;


	public WebElement getOrderId() {
		return orderId;
	}


	public WebElement getLogOut() {
		return logOut;
	}


}
