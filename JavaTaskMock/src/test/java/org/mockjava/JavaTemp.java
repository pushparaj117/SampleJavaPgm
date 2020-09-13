package org.mockjava;

public class JavaTemp {
	public static void main(String[] args) {
		
		int a = 20;
		int b=30;
		System.out.println("Before swapping :");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping :");
		System.out.println("a=" + a);
		System.out.println("b=" + b);	
	}

}
