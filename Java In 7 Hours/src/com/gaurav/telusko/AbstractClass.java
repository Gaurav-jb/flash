package com.gaurav.telusko;

class Printer{
	
	public void show(Number i)
	{
		
		System.out.println(i);
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Printer obj = new Printer();
		obj.show(5.5f);
		
		
	}

}
