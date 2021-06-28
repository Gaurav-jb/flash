package com.gaurav.telusko;

class Calc{
	
	int num1;
	int num2;
	int result;
	
	public void perform(){

		result = num1 + num2;
		
		
	}
	
	
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Calc c = new Calc();
		c.num1 = 5;
		c.num2 = 3;
		
		c.perform();
		
		System.out.println(c.result);
		

	}

}
