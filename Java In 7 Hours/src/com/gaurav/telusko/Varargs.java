package com.gaurav.telusko;

class Args {
	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}

}

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Args a = new Args();

		System.out.println(a.add(1, 2, 3, 4, 4, 4, 4));

	}

}
