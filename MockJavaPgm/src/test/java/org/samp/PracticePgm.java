package org.samp;

public class PracticePgm {
	
	
	public static void main(String[] args) {
		
		int i = 153; // 1*1*1 + 5*5*5+3*3*3 = 1+125+27=153
		int temp =0,result =0;
		int n = i;

		while(i>0) 
		{
		temp = i%10;  // last number -3// 5
		result=(temp*temp*temp) + result; // 2it 27+125 +1
		i=i/10; // get quot that's 15?// 2it i-1
		}

		if(n==result)
		{
		System.out.println("It is a armstrong number");
		}
		else
		{
		System.out.println("It is not a armstrong number");
		}
		
		
		
		
		
	}

}
