package org.mockjava;

import java.util.Scanner;

public class JavaRevString {

	
	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner s=new Scanner(System.in);
		String s1 = s.next();
		String s2="";
		
		for (int i = s1.length() - 1; i >=0; i--) {
			
			char c1 = s1.charAt(i);
			s2=s2 + c1;
		}
		System.out.println("Reverse of the string is : "+s2);
	}
}
