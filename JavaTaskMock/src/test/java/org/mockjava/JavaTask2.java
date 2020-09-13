package org.mockjava;

import java.util.Set;
import java.util.TreeSet;

public class JavaTask2 {

	public static void main(String[] args) {
		int[] a = {10,20,30,10,20,30,40,50,40,60,70};
		Set<Integer> n  = new TreeSet<Integer>();
		for (Integer x : a) {
			n.add(x);
		}
		System.out.println("The Array without duplicate is :" );
         System.out.println(n);		
 		
				}
				
			}