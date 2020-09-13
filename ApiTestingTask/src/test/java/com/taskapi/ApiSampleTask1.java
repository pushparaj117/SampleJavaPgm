package com.taskapi;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiSampleTask1 {

	public static void main(String[] args) throws IOException, ParseException {
		
	    JSONParser jpar=new JSONParser();
	    FileReader f=new FileReader("C:\\Users\\PUSHPARAJ\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\json files\\Ecom.json");
		
		Object obj = jpar.parse(f);
		JSONObject js=(JSONObject)obj;
		Object o1 = js.get("username");
		System.out.println(o1);	
		System.out.println(js.get("password"));
		System.out.println(js.get("Search Product"));
		System.out.println(js.get("Product Name"));
		System.out.println(js.get("Price Inclusive of Taxes"));
		System.out.println(js.get("CGST"));
		System.out.println(js.get("SGST"));
		System.out.println(js.get("Type of Delivery"));
		System.out.println(js.get("Delivery by"));
		System.out.println(js.get("Fastest delivery"));
		System.out.println(js.get("Quantity"));
		System.out.println(js.get("Add gift options"));
		System.out.println(js.get("Material"));
		System.out.println(js.get("Colour"));
		System.out.println(js.get("Style"));
		System.out.println(js.get("Lining description"));
		System.out.println(js.get("Brand"));
		System.out.println(js.get("Delivery Address"));
		System.out.println(js.get("Landmark"));
		System.out.println(js.get("Contact No"));
		System.out.println(js.get("PinCode"));
		System.out.println(js.get("State"));
		System.out.println(js.get("Payment Type1"));
		System.out.println(js.get("Payment Type2"));
		System.out.println(js.get("Payment Type3"));
		System.out.println(js.get("Payment Type4"));
		System.out.println(js.get("Payment Type5"));
		System.out.println(js.get("Payment Type6"));
		System.out.println(js.get("Condition"));
		System.out.println(js.get("Sold by"));
		System.out.println(js.get("Return Option"));
		System.out.println(js.get("Product Review"));
		System.out.println(js.get("Add another Product"));
	}	

	
	
}
