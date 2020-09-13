@Fourth
Feature: Verifying Adactin Order Cancellation

	Scenario Outline: Verifying Adactin order cancellation with valid Orderid

	Given user is on the Adactin Page
	When user should enter the  "<userName>" and "<password>"
	And user should click on the booked itinerary
	And user should enter the order id and click go "<orderid>"
	And user should click the checkbox and click cancel selected button
	And user should handle the alert box and cancelled order
	Then user should click on logout button
		
	Examples:
			|userName|password|orderid|
			
			|Pushparaj|HF07YG|6LWV075TY7|