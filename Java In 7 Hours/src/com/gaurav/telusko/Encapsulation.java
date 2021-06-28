package com.gaurav.telusko;

class Gaurav {

	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gaurav g = new Gaurav();
		g.setRollno(2);
		g.setName("Gaurav");

		System.out.println(g.getRollno());
		System.out.println(g.getName());

	}

}
