package com.gaurav.telusko;

class E{
	
	public void show() {
		
		System.out.println("in E....");
	}
	
}

class F extends E{
	
	public void show() {
		super.show();
		System.out.println("in F....");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F f = new F();
		f.show();

	}

}
