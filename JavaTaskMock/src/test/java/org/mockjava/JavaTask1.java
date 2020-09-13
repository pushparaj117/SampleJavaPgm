package org.mockjava;

import java.util.Scanner;

public class JavaTask1 {
	
	public static void main(String[] args) {
		
		//Prime number or not
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter the number :" +num);
		
		for (int i = 2; i <= num/2; i++) {
			
			//Condition check for prime number or not
			
			
		}
		if (num%2==0) {
			System.out.println("Given number is not a prime number");
		}
		else {
			System.out.println("Given number is a prime number");
		}
		
	}

}
