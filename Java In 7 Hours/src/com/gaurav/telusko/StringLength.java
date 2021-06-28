package com.gaurav.telusko;

public class StringLength {
	
	public static void main(String[] args) {
		
		String s = "Gauravbhavsar";
		
		int i = 0;
		
		for(char c: s.toCharArray()) {
			i++;
		}
		
		System.out.println("Length of the gien string is ::" +i);
	}

}
