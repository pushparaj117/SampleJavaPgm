package com.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage(){
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
	
	public void selectHotel() throws InterruptedException {
		Thread.sleep(3000);
		klick(getRdbtn());
		Thread.sleep(3000);
		klick(getCntbtn());
		
	}

}
