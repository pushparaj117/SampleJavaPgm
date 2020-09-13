package org.mock;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTaskMock extends BaseClass {

	public PomTaskMock() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//a[@id='u_0_2']")
	private WebElement createAcc;

	@FindBy(id = "day")
	private WebElement selDay;
	@FindBy(id = "month")
	private WebElement selMon;
	@FindBy(id = "year")
	private WebElement selYear;

	public WebElement getCreateAcc() {
		return createAcc;
	}

	public WebElement getSelDay() {
		return selDay;
	}

	public WebElement getSelMon() {
		return selMon;
	}

	public WebElement getSelYear() {
		return selYear;
	}
	
	public void btnClick() {
		clck(getCreateAcc());

	}
	

}
