package com.gaurav.telusko;

public class Singleton {
	
	public static Singleton single_Instance = null;
	
	String s;
	
	private Singleton() {
		
		s = "i am a string part of singleton class";
		
	}
	
	public static Singleton getInstance() {
		if(single_Instance == null) {
			single_Instance = new Singleton();
			
		
		}
		return single_Instance;
		
	}
	
	public void checkSingleton() {
		
		System.out.println("Singleton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton s1;
		 s1 = Singleton.getInstance();
		 s1.checkSingleton();
	}

}
