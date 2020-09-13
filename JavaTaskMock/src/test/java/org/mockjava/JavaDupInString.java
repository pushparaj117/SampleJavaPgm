package org.mockjava;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaDupInString {

	public static void main(String[] args) {
		
		String s="Seleniumandjava";
		char[] ch = s.toCharArray();
		Map<Character, Integer> m=new LinkedHashMap();
		for (char data : ch) {
			
			if (m.containsKey(data)) {
				
				Integer count = m.get(data);
				m.put(data,count + 1 );
				
			}
			
			else {
				m.put(data, 1);
			}
			
			
		}
		System.out.println("The Duplicate in String is :");
		System.out.println(m);
	}
	
}
