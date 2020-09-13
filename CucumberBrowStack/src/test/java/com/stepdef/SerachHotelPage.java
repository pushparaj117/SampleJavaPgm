package com.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerachHotelPage extends BaseClass {

	public SerachHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location") 
    private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement htl;
	 
	@FindBy(id="room_type")
	private WebElement rmtp;
	
	 
	@FindBy(id="room_nos")
	private WebElement rmnos;
	
	 
	@FindBy(id="adult_room")
	private WebElement adprrm;
	
	 
	@FindBy(id="child_room")
	private WebElement chldrm;
	
	@FindBy(id="Submit")
	private WebElement srch;
	
	@FindBy(id="datepick_in")
	private WebElement chckin ;
	
	@FindBy(id="datepick_out")
	private WebElement chckout;

	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement bookedItin;
	
	
	public WebElement getBookedItin() {
		return bookedItin;
	}
	public WebElement getHtl() {
		return htl;
	}
	public WebElement getRmtp() {
		return rmtp;
	}
	public WebElement getRmnos() {
		return rmnos;
	}
	public WebElement getAdprrm() {
		return adprrm;
	}

	public WebElement getChldrm() {
		return chldrm;
	}

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getChckout() {
		return chckout;
	}

	public WebElement getChckin() {
		return chckin;
	}

	public void searchHotel(String lctn, String htl, String rmtype,String rmnos, String ckin, String ckout,String apr,String cpr) throws InterruptedException {

		drdn(getLoc(), lctn);
		drdn(getHtl(), htl);
		drdn(getRmtp(), rmtype);
		drdn(getRmnos(), rmnos);
		fill(getChckin(), ckin);
		fill(getChckout(), ckout);
		Thread.sleep(3000);
		drdn(getAdprrm(), apr);
		drdn(getChldrm(), cpr);
		Thread.sleep(4000);
		klick(getSrch());	
		
}
	public void bookedItiniClick() {
		
		klick(getBookedItin());

	}
	
}
