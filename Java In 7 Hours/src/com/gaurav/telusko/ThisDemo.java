package com.gaurav.telusko;

class Calc2 {

	int num1;
	int num2;
	int result;

	public Calc2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc2 c = new Calc2(4, 5);

		System.out.println(c.num1);
		System.out.println(c.num2);

	}

}
