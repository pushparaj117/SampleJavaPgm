Feature: Verifying Adactin login functionalities

	Scenario Outline: Verifying Adactin Booking details with credentials

	Given user is on Adactin Page
	When user should enter "<userName>","<password>","<location>","<hotels>","<roomType>","<numOfRooms>","<checkinDt>","<checkkOutDt>","<adultNo>","<chlidNo>","<firstName>","<lastName>","<add>","<ccNo>","<ccType>","<expMon>","<expYr>"and"<cvvNo>"
	And print the booking id
	Then user should click the logout button

		
		Examples:
			|userName|password|location|hotels|roomType|numOfRooms|checkinDt|checkkOutDt|adultNo|chlidNo|firstName|lastName|add|ccNo|ccType|expMon|expYr|cvvNo|
			
			|Pushparaj|HF07YG|Melbourne|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|London|Hotel Cornice|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Paris|Hotel Sunshine|Deluxe|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.1,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Brisbane|Hotel Sunshine|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.14,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Hervey|Deluxe|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.21,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Paris|Hotel Cornice|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.11,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Brisbane|Hotel Sunshine|Deluxe|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.41,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Hervey|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.61,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Paris|Hotel Sunshine|Deluxe|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.71,FirstColny|4567765498768907|VISA|July|2022|234|
			|Pushparaj|HF07YG|Melbourne|Hotel Cornice|Double|2 - Two|24/08/2020|25/08/2020|3 - Three|2 - Two|Pushparaj|Utham|No.18,FirstColny|4567765498768907|VISA|July|2022|234|			
						