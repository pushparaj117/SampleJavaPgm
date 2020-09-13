package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomThird extends BaseClass {

	public PomThird(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0") 
    private WebElement rdbtn ;
	
	@FindBy(id="continue") 
    private WebElement cntbtn ;

	public WebElement getRdbtn() {
		return rdbtn;
	}

	public WebElement getCntbtn() {
		return cntbtn;
	}
}
	
	
