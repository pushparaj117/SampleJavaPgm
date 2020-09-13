@Sanity
Feature: Verifying Adactin login functionalities

	Scenario Outline: Verifying Adactin Booking details with credentials

	Given user is on Adactin Page
	When user should enter "<userName>","<password>","<location>","<hotels>","<roomType>","<numOfRooms>","<checkinDt>","<checkkOutDt>","<adultNo>","<chlidNo>","<firstName>","<lastName>","<add>","<ccNo>","<ccType>","<expMon>","<expYr>"and"<cvvNo>"
	And print the booking id
	And user should click my itinerary
	And user should serach orderid and click go
	And user should click the checkbox and click cancel selected
	And user should click ok in alert box and show cancelled order 
	Then user should click the logout button
	Examples:
			|userName|password|location|hotels|roomType|numOfRooms|checkinDt|checkkOutDt|adultNo|chlidNo|firstName|lastName|add|ccNo|ccType|expMon|expYr|cvvNo|
			
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|1 - One|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			
			
	