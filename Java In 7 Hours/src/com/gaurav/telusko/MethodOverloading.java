package com.gaurav.telusko;


class Add{
	
	public void add(int i, int j) {
		System.out.println(i+j);
		
	}
	

	public void add(int i, int j, int k) {
		System.out.println(i+j*k);
		
	}
	
	
	public void add(int i, double j, int k) {
		System.out.println(i+j*k);
		
	}
	
	
	
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add a = new Add();
		a.add(2, 3);
		a.add(2, 3, 4);
		a.add(1, 2.5, 5);

	}

}
