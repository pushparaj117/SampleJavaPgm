package org.mockjava;

import java.util.Scanner;

public class JavaPrime {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int getNum = s.nextInt();
		System.out.println("Enter the number to check :" +getNum);
		int flag=0;
		if (getNum==0 || getNum==1) {
			System.out.println("0 and 1 is not an prime number");
		}
		else {
			
			for (int i = 2; i < getNum/2; i++) {
				
				if (getNum%i==0) {
							
					flag=1;
				}
				
			}
			if (flag==0) {
				
				System.out.println("Number is Prime");
				
			}
			else {
				System.out.println("Number is not a prime");
			}
		}
		
		
	}

}
