package org.mockjava;

import java.util.Scanner;

public class JavaPalind {

	public static void main(String[] args) {
		System.out.println("Enter the number to Check : ");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		int rem=0,res=0;
		int n=num;
		while (num>0) {   
			
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
			
		}
		if (n==res) {
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is not a Palindrome");
		}
		
		
		
	}
}
