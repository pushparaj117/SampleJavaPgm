package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFourth extends BaseClass {
	
	
	public PomFourth(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name") 
    private WebElement fstnm ;
	
	@FindBy(id="last_name") 
    private WebElement lstnm ;
	
	@FindBy(id="address") 
    private WebElement add ;
	
	public WebElement getFstnm() {
		return fstnm;
	}

	public WebElement getLstnm() {
		return lstnm;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcdno() {
		return ccdno;
	}

	public WebElement getCcdtyp() {
		return ccdtyp;
	}

	public WebElement getCcdexmon() {
		return ccdexmon;
	}

	public WebElement getCcdexyr() {
		return ccdexyr;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBknwbtn() {
		return bknwbtn;
	}

	@FindBy(id="cc_num") 
    private WebElement ccdno ;
	
	@FindBy(id="cc_type") 
    private WebElement ccdtyp ;
	

	@FindBy(id="cc_exp_month") 
    private WebElement ccdexmon ;
	

	@FindBy(id="cc_exp_year") 
    private WebElement ccdexyr ;
	
	@FindBy(id="cc_cvv") 
    private WebElement cvvno ;
	
	@FindBy(id="book_now") 
    private WebElement bknwbtn ;
	
}

