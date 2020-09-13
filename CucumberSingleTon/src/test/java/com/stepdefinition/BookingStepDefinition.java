package com.stepdefinition;

import com.manager.PageManager1;
import com.stepdefinition.BookingConfirmationPom;
import com.stepdefinition.BookingHotelPom;
import com.stepdefinition.LoginPagePom;
import com.stepdefinition.SearchHotelPom;
import com.stepdefinition.SelectHotelPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingStepDefinition extends BaseAdactin {

	PageManager1 manager1;
	LoginPagePom loginPagePom;
	SearchHotelPom searchHotelPom;
	SelectHotelPom selectHotelPom;
	BookingHotelPom bookingHotelPom;
	BookingConfirmationPom bookingConfirmationPom;
	BookedItineraryPom bookedItineraryPom;
	CancelBookingPom cancelBookingPom;
	@Given("user is on Adactin Page")
	public void user_is_on_Adactin_Page() {
	    launchApp();
	    urlPass("http://adactinhotelapp.com/");
	}

	@When("user should enter {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_enter_and(String unm, String psw, String lctn, String htl, String rmtype, String rmnos, String ckin, String ckout, String apr,String cpr,String fn, String ln, String add, String ccno , String cctyp, String exmn, String exyr, String cvv) throws InterruptedException {
		manager1 = PageManager1.getInstance();
		loginPagePom = manager1.getLoginPagePom();
		loginPagePom.login(unm, psw);
		 
        searchHotelPom = manager1.getSearchHotelPom();
//		searchHotelPom.searchHotel(lctn, htl, rmtype, rmnos, ckin, ckout, apr, cpr);

		  selectHotelPom = manager1.getSelectHotelPom();
		  selectHotelPom.selectHotel();
			
			bookingHotelPom = manager1.getBookingHotelPom();

//			bookingHotelPom.bookingHotel(fn, ln, add, ccno, cctyp, exmn, exyr, cvv);
	
	}

	@When("print the booking id")
	public void print_the_booking_id() throws InterruptedException {
		bookingConfirmationPom = manager1.getBookingConfirmationPom();
		bookingConfirmationPom.orderPrint();
	    
	}
	@When("user should click my itinerary")
	public void user_should_click_my_itinerary() {
	    bookingConfirmationPom = manager1.getBookingConfirmationPom();
	    bookingConfirmationPom.itineryClick();
	    
	}

	@When("user should serach orderid and click go")
	public void user_should_serach_orderid_and_click_go() {
		 bookedItineraryPom = manager1.getBookedItineraryPom();
		 bookedItineraryPom.searchOrderId();
	    
	}

	@When("user should click the checkbox and click cancel selected")
	public void user_should_click_the_checkbox_and_click_cancel_selected() {
		cancelBookingPom=manager1.getCancelBookingPom();
		cancelBookingPom.cancelOperation();
	}

	
	@When("user should click ok in alert box and show cancelled order")
	public void user_should_click_ok_in_alert_box_and_show_cancelled_order() {
		alertHandle();
		System.out.println("The booking is cancelled for order id: " +myOrderId);
		
		
	}
	
	@Then("user should click the logout button")
	public void user_should_click_the_logout_button() throws InterruptedException {
		 bookedItineraryPom = manager1.getBookedItineraryPom();
		 bookedItineraryPom.finalLogOut();
	}
	
	



}
