package com.gaurav.telusko;

class Calculator1 {

	public int add(int i, int j) {

		return i + j;
	}
}

class CalculatorAdv extends Calculator1 {
	
	public int sub(int i, int j) {

		return i - j;
	}
	}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorAdv c = new CalculatorAdv();
		int results = c.add(4, 5);
		int results1 = c.sub(3, 2);
		
		System.out.println(results);
		System.out.println(results1);

	}

}
