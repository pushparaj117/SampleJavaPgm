package org.appium;


import java.util.List;

import io.appium.java_client.MobileElement;

public class Base {
	
	public static boolean isElementPresent(List<MobileElement> frstElement) {
		
		boolean isFound=false;
		 if(frstElement.size()!=0) {
			 
			 isFound=true;
			 
		 }
		return isFound;
		
		
		
	}
	
	

}
