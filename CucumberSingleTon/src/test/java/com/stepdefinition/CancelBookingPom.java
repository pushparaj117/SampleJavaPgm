package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPom extends BaseAdactin {

	public CancelBookingPom() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkBox;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelBookBtn;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelBookBtn() {
		return cancelBookBtn;
	}
	public void cancelOperation() {

		klick(getCheckBox());
		klick(getCancelBookBtn());
		
	}
	
	
}
