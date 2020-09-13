package org.mockjava;

import java.util.Scanner;

public class JavaArmstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to Check : ");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		int rem=0,res=0;
		int n=num;
		while (num>0) {   
			
			rem=num%10;
			res=res + (rem*rem*rem);
			num=num/10;
			
		}
		if (n==res) {
			System.out.println("Given Number is Armstrong");
		}
		else {
			System.out.println("Given Number is not a Armstrong");
		}
		
		
	}
}
