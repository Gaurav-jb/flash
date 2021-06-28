package com.gaurav.telusko;

class Outer { // outer.class
	int a;

	public void show() {

		System.out.println("in outer.....");
	}

	class Inner {// outer$inner.class

		public void display() {

			System.out.println("in inner.....");
		}

	}

}

public class InnnerDemo {// InnerDemo.class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj1 = new Outer();
		obj1.show();

		Outer.Inner obj2 = obj1.new Inner();
		obj2.display();

	}

}
