package org.mockjava;

import java.util.Scanner;

public class JavaMockPrac {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = s.nextInt();	//151

		int temp = 0;
		int result =0;
		int final1 = num; //

		while(final1>0)
		{

		temp=final1%10;	//1	//5 	//1
		result=(result*10) +temp;	// 1 	// 15 //151
		final1=final1/10;	// 15	//
		}

		if(result==num)
		{
		System.out.println("Is Palindrome");
		}
		else
		{
		System.out.println("Not a Palindrome");
		}
		}
		
		
	

}
