package com.taskapi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiSampleTask {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser js = new JSONParser();
		FileReader read = new FileReader("C:\\Users\\PUSHPARAJ\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\json files\\Task.json");
		Object o = js.parse(read);
		JSONObject obj = (JSONObject) o; 
		Object o1 = obj.get("userName");
		System.out.println(o1);
		Object o2 = obj.get("password");
		System.out.println(o2);
		System.out.println(obj.get("trip"));
		System.out.println(obj.get("from"));
		System.out.println(obj.get("to"));
		System.out.println(obj.get("depart"));
		System.out.println(obj.get("return"));
		System.out.println(obj.get("travelClass"));
		System.out.println(obj.get("adultPassenger"));
		System.out.println(obj.get("childPassenger"));
		System.out.println(obj.get("infantPassenger"));
		System.out.println(obj.get("departureTiming"));
		System.out.println(obj.get("stops"));
		System.out.println(obj.get("priceRange"));
		System.out.println(obj.get("duration"));
		System.out.println(obj.get("preferredAirline"));
		System.out.println(obj.get("flightInfo"));
		System.out.println(obj.get("baseFare"));
		System.out.println(obj.get("taxes"));
		System.out.println(obj.get("totalFare"));
		System.out.println(obj.get("baggageLimit"));
		System.out.println(obj.get("payment"));
		System.out.println(obj.get("firstPassengerDetails"));
		System.out.println(obj.get("secondPassengerDetails"));
		System.out.println(obj.get("thirdPassengerDetails"));
		System.out.println(obj.get("fourthPassengerDetails"));
		System.out.println(obj.get("fifthPassengerDetails"));
		System.out.println(obj.get("e-mail"));
		System.out.println(obj.get("mobileNumber"));
		System.out.println(obj.get("seatNo"));
		System.out.println(obj.get("paymentStatus"));
		
	}
	
	
	
}
