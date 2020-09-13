package com.manager;
import com.stepdefinition.BaseAdactin;
import com.stepdefinition.BookedItineraryPom;
import com.stepdefinition.BookingConfirmationPom;
import com.stepdefinition.BookingHotelPom;
import com.stepdefinition.CancelBookingPom;
import com.stepdefinition.LoginPagePom;
import com.stepdefinition.SearchHotelPom;
import com.stepdefinition.SelectHotelPom;

public class PageManager1 extends BaseAdactin {
private PageManager1() {
		
	}
	public static PageManager1 getInstance() {
		return (pageManager1==null)?pageManager1=new PageManager1():pageManager1;
	}
	
	private static PageManager1 pageManager1;
	private LoginPagePom loginPagePom;
	private SearchHotelPom searchHotelPom;
	private SelectHotelPom selectHotelPom;
	private BookingHotelPom bookingHotelPom;
	private BookingConfirmationPom bookingConfirmationPom;
	private BookedItineraryPom bookedItineraryPom;
	private CancelBookingPom cancelBookingPom;
	public static PageManager1 getPageManager1() {
		return pageManager1;
	}
	public BookedItineraryPom getBookedItineraryPom() {
		return (bookedItineraryPom==null)? bookedItineraryPom=new BookedItineraryPom():bookedItineraryPom;
	}
	public CancelBookingPom getCancelBookingPom() {
		
		return (cancelBookingPom==null) ? cancelBookingPom=new CancelBookingPom():cancelBookingPom;
	}
	public LoginPagePom getLoginPagePom() {
//		System.out.println(loginPagePom);
		return (loginPagePom==null) ? loginPagePom=new LoginPagePom():loginPagePom;
	}
	public SearchHotelPom getSearchHotelPom() {
//		System.out.println(searchHotelPom);
		return (searchHotelPom==null) ? searchHotelPom=new SearchHotelPom():searchHotelPom ;
	}
	public SelectHotelPom getSelectHotelPom() {
//		System.out.println(selectHotelPom);
		return (selectHotelPom==null) ? selectHotelPom = new SelectHotelPom():selectHotelPom;
	}
	public BookingHotelPom getBookingHotelPom() {
//		System.out.println(bookingHotelPom);
		return (bookingHotelPom==null) ? bookingHotelPom = new BookingHotelPom():bookingHotelPom;
	}
	public BookingConfirmationPom getBookingConfirmationPom() {
//		System.out.println(bookingConfirmationPom);
		return (bookingConfirmationPom==null) ? bookingConfirmationPom=new BookingConfirmationPom():bookingConfirmationPom;
	}
	
	
	
}
