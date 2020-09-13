package com.manager;

import com.stepdef.BaseClass;
import com.stepdef.BookingConfirmationPage;
import com.stepdef.BookingHotelPage;
import com.stepdef.LoginPage;
import com.stepdef.SelectHotelPage;
import com.stepdef.SerachHotelPage;


public class PageManager extends BaseClass {

private PageManager() {
		
	}
	public static PageManager getInstance() {
		return (pageManager1==null)?pageManager1=new PageManager():pageManager1;
	}
	
	private static PageManager pageManager1;
	private LoginPage loginPagePom;
	private SerachHotelPage searchHotelPom;
	private SelectHotelPage selectHotelPom;
	private BookingHotelPage bookingHotelPom;
	private BookingConfirmationPage bookingConfirmationPom;
	
	public static PageManager getPageManager1() {
		return pageManager1;
	}
	
	
	public LoginPage getLoginPagePom() {
//		System.out.println(loginPagePom);
		return (loginPagePom==null) ? loginPagePom=new LoginPage():loginPagePom;
	}
	public SerachHotelPage getSearchHotelPom() {
//		System.out.println(searchHotelPom);
		return (searchHotelPom==null) ? searchHotelPom=new SerachHotelPage():searchHotelPom ;
	}
	public SelectHotelPage getSelectHotelPom() {
//		System.out.println(selectHotelPom);
		return (selectHotelPom==null) ? selectHotelPom = new SelectHotelPage():selectHotelPom;
	}
	public BookingHotelPage getBookingHotelPom() {
//		System.out.println(bookingHotelPom);
		return (bookingHotelPom==null) ? bookingHotelPom = new BookingHotelPage():bookingHotelPom;
	}
	public BookingConfirmationPage getBookingConfirmationPom() {
//		System.out.println(bookingConfirmationPom);
		return (bookingConfirmationPom==null) ? bookingConfirmationPom=new BookingConfirmationPage():bookingConfirmationPom;
	}
	
	
}
