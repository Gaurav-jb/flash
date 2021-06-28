package com.gaurav.telusko;
import java.util.Arrays;


public class SecondLargestInArrayExample1 {

	public static int getSecondLargest(int[]a, int total) {
		Arrays.sort(a);
		return a[total-3];
	}
	
	public static void main(String[] args) {
		
		int a[] = {11,23,45,56,77,88};
		
		int b[]= {12,44,55,22,12,90};
		
		System.out.println("Second Largest:" +getSecondLargest(a, 6));
		System.out.println("Second Largest:" +getSecondLargest(b, 6));
	}
	
	 
	
	
}
