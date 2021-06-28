package com.gaurav.telusko;

class A{
	
	public void test(){
		System.out.println("A");
		
	}
}

class B extends A{
	
	public void test(){
		System.out.println("B");
		
	}
}


public class IBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		a.test();
		

	}

}
