package com.stepdefinition;

import java.util.List;
import java.util.Map;

import com.manager.PageManager1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionDatatype extends BaseAdactin {
	PageManager1 manager1;
	LoginPagePom loginPagePom;
	SearchHotelPom searchHotelPom;
	SelectHotelPom selectHotelPom;
	BookingHotelPom bookingHotelPom;
	BookingConfirmationPom bookingConfirmationPom;
	BookedItineraryPom bookedItineraryPom;
	CancelBookingPom cancelBookingPom;
	@Given("User is on Adactin page")
	public void user_is_on_Adactin_page() {
	//	launchApp();
	  //  urlPass("http://adactinhotelapp.com/");
	    
	}

	@When("User should enter {string}, {string} and click")
	public void user_should_enter_and_click(String unm, String psw) {
	    
		manager1 = PageManager1.getInstance();
		loginPagePom = manager1.getLoginPagePom();
		loginPagePom.login(unm, psw);
	}

	@When("User should search hotel by values {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_search_hotel_by_values_and(String lcn, String htls, String rmtyp, String chckIn, String chckOut, String frstNm, String lstNm, String addrs, String ccNo, String expMon, String expYr, String cvvNo, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    
		searchHotelPom = manager1.getSearchHotelPom();
		searchHotelPom.searchHotel(lcn,htls,rmtyp,chckIn,chckOut);
		List<Map<String, String>> mp = dataTable.asMaps();
		Map<String, String>map = mp.get(2);
		String roomNos = map.get("noOfRooms");
		String adultNos = map.get("adultsPerRoom");
		String childNos = map.get("childPerRoom");
		drdn(searchHotelPom.getRmnos(),roomNos);
		drdn(searchHotelPom.getAdprrm(),adultNos);
		drdn(searchHotelPom.getChldrm(),childNos);
		Thread.sleep(5000);
		klick(searchHotelPom.getSrch());

		selectHotelPom = manager1.getSelectHotelPom();
		selectHotelPom.selectHotel();
		
		bookingHotelPom = manager1.getBookingHotelPom();

		bookingHotelPom.bookingHotel(frstNm, lstNm, addrs, ccNo,expMon, expYr, cvvNo);
		String cardTp = map.get("cardType");
		drdn(bookingHotelPom.getCcdtyp(),cardTp);
		Thread.sleep(4000);
		klick(bookingHotelPom.getBknwbtn());
	}

	@When("print the booking id generated")
	public void print_the_booking_id_generated() {
		bookingConfirmationPom = manager1.getBookingConfirmationPom();
		bookingConfirmationPom.orderPrint();
	    
	}

	@Then("user should enter the logout button")
	public void user_should_enter_the_logout_button() throws InterruptedException {
		
		
		bookingConfirmationPom = manager1.getBookingConfirmationPom();
		Thread.sleep(4000);
		klick(bookingConfirmationPom.getLogOut());
		
	}

	
	
}
