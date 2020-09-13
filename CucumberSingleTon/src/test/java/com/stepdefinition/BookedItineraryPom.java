package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPom extends BaseAdactin {
	
	public BookedItineraryPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement passOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement goOrderId;
	
	@FindBy(id="logout")
	private WebElement logoutBtn;
	
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getPassOrderId() {
		return passOrderId;
	}
	public WebElement getGoOrderId() {
		return goOrderId;
	}

	public void searchOrderId() {
		fill(getPassOrderId(), myOrderId);
		klick(getGoOrderId());
	}
	
	public void finalLogOut() {
	klick(getLogoutBtn());	
	}
	

}
