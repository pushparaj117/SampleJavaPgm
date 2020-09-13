package org.mockjava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		System.out.println("Enter the First text :"+s1 );
		System.out.println("Enter the Second text "+s2);
		
		if (!(s1.length()==s2.length())) {
			
			System.out.println("It's not anagram due to length is not equal");
			
		}
		else {
			
			char[] c1 = s1.toCharArray();
			Arrays.sort(c1);
			char[] c2 = s2.toCharArray();
			Arrays.sort(c2);
			
			if (Arrays.equals(c1, c2)) {
				System.out.println("Given texts are Anagram");
			}
			else {
				System.out.println("Given texts are not a Anagram");
			}
		}
		
	}

}
