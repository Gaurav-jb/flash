package com.gaurav.telusko;

class A {

	public A() {

		System.out.println("in A.....");
	}

	public A(int i) {

		System.out.println("in A int ....");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("in B.....");
	}

	public B(int i) {
		super(i);
		System.out.println("in B int ....");
	}

}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B(5);

	}

}