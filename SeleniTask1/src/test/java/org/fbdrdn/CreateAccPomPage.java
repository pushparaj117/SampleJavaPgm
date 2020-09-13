package org.fbdrdn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccPomPage extends BaseCls {
	
	public CreateAccPomPage() {
	
		PageFactory.initElements(driver1, this);
		
	}
	
	@FindBy(id="u_0_2")
	private WebElement createBtn;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	public void createAccBtn() {
		

		clickFunc(getCreateBtn());

	}
	
	public void seleDropDown() {
		dropDown(getDay(), "3", null, null);
		dropDown(getMonth(), null, "Sep", null);
		dropDown(getYear(), null, null, "3");
	}
	
	
	

}
