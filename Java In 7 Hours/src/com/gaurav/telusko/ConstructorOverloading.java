package com.gaurav.telusko;

class Casio {

	int num1;
	int num2;
	String operation;

	public Casio() {

		num1 = 0;
		num2 = 0;
		operation = "nothing..";

	}

	public Casio(int i) {

		num1 = i;
		num2 = 0;
		operation = "nothing..";

	}

	public Casio(int i, int j) {

		num1 = i;
		num2 = j;
		operation = "nothing..";

	}

	public Casio(int i, int j, String op) {

		num1 = i;
		num2 = j;
		operation = op;

	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Casio c = new Casio(1, 2, "Gaurav");
		
		System.out.println(c.num1);
		System.out.println(c.num2);
		System.out.println(c.operation);
		
		
	}

}
