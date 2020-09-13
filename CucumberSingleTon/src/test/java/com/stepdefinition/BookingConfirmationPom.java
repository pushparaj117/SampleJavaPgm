package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPom extends BaseAdactin {
	
public BookingConfirmationPom() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="logout")
	private WebElement logOut;
	
	@FindBy(id="order_no")
	private WebElement orderId;

	@FindBy(id="my_itinerary")
	private WebElement myItin;
	
	
	public WebElement getMyItin() {
		return myItin;
	}
	
	public void itineryClick() {
		
		klick(getMyItin());
	}

	public WebElement getOrderId() {
		return orderId;
	}


	public WebElement getLogOut() {
		return logOut;
	}

	public void orderPrint() {

		getAtrri(getOrderId());
		
	}
	public void logOutPage() {
		klick(getLogOut());

	}
}
