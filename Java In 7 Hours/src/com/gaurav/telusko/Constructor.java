package com.gaurav.telusko;

class Calc1 {
	
	int num1;
	int num2;
	
	
	public Calc1()
	{
		num1 = 5;
		num2 = 4;
		System.out.println("In a Constructor......");
		
	}
	
	public Calc1(int n)
	{
		
		num1 = n;
		num2 = n;
		
		
	}
	public Calc1(double d, int n)
	{
		
		num1 = (int) d;
		num2 = n;
		
	}
	
	
	
}



public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc1 c = new Calc1(9.5,8);
		
		System.out.println(c.num1);
		System.out.println(c.num2);

	}

}
