package com.taskapi;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiTaskDay3 {
	
public static void main(String[] args) throws IOException, ParseException {
		
	    JSONParser jpar=new JSONParser();
	    FileReader f=new FileReader("C:\\Users\\PUSHPARAJ\\eclipse-workspace\\ApiTestingTask\\src\\test\\resources\\json files\\Day3.json");
		Object obj = jpar.parse(f);
		JSONObject js=(JSONObject)obj;
		System.out.println(js.get("page"));
		System.out.println(js.get("per_page"));
		System.out.println(js.get("total"));
		System.out.println(js.get("total_pages"));
		System.out.println();
		
		Object o1 = js.get("data");
		JSONArray a1=(JSONArray)o1;
		for (int i = 0; i <a1.size(); i++) {
		Object o2 = a1.get(i);
		JSONObject js1=(JSONObject)o2;
		System.out.println(js1.get("id"));
		System.out.println(js1.get("email"));
		System.out.println(js1.get("first_name"));
		System.out.println(js1.get("last_name"));
		System.out.println(js1.get("avatar"));
		System.out.println();
		}
		Object o3 = js.get("ad");
		JSONObject js2=(JSONObject)o3;
		System.out.println(js2.get("company"));
		System.out.println(js2.get("url"));
		System.out.println(js2.get("text"));
}
}
