package com.gaurav.telusko;

class Emp {

	int eid;
	int salary;
	static String ceo;

	public void show() {

		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp gaurav = new Emp();
		gaurav.eid = 1;
		gaurav.salary = 4000;
		gaurav.ceo = "CEO";
		
		Emp sagar = new Emp();
		sagar.eid = 2;
		sagar.salary = 5000;
		sagar.ceo = "CEO1";
		sagar.ceo = "Test";
		
		Emp.ceo = "demo";

		gaurav.show();
		sagar.show();

	}

}
