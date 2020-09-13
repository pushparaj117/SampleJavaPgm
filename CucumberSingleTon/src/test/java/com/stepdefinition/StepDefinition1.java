package com.stepdefinition;

import com.manager.PageManager1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends BaseAdactin {
	
	PageManager1 manager1;
	LoginPagePom loginPagePom;
	SearchHotelPom searchHotelPom;
	BookedItineraryPom bookedItineraryPom;
	CancelBookingPom cancelBookingPom;

	@Given("user is on the Adactin Page")
	public void user_is_on_the_Adactin_Page() {
		launchApp();
	    urlPass("http://adactinhotelapp.com/");
	    
	}

	@When("user should enter the  {string} and {string}")
	public void user_should_enter_the_and(String unm, String psw) {
		manager1 = PageManager1.getInstance();
		loginPagePom = manager1.getLoginPagePom();
		loginPagePom.login(unm, psw);
		
		
	}

	@When("user should click on the booked itinerary")
	public void user_should_click_on_the_booked_itinerary() {
		manager1 = PageManager1.getInstance();
		searchHotelPom = manager1.getSearchHotelPom();
		searchHotelPom.bookedItiniClick();
	}

	@When("user should enter the order id and click go {string}")
	public void user_should_enter_the_order_id_and_click_go(String order) {
	    
		manager1 = PageManager1.getInstance();
		 bookedItineraryPom = manager1.getBookedItineraryPom();
		 fill(bookedItineraryPom.getPassOrderId(), order);
		
	}

	@When("user should click the checkbox and click cancel selected button")
	public void user_should_click_the_checkbox_and_click_cancel_selected_button() {
	    
		manager1 = PageManager1.getInstance();
		cancelBookingPom=manager1.getCancelBookingPom();
		cancelBookingPom.cancelOperation();
	}

	@When("user should handle the alert box and cancelled order")
	public void user_should_handle_the_alert_box_and_cancelled_order() {
		alertHandle();
		System.out.println("	The booking is cancelled for given order id		");
		
		
	}

	@Then("user should click on logout button")
	public void user_should_click_on_logout_button() {
		
		manager1 = PageManager1.getInstance();
		 bookedItineraryPom = manager1.getBookedItineraryPom();
		 bookedItineraryPom.finalLogOut();
	    
	}
	
	
	
	
}
