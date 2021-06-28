package com.gaurav.telusko;

class DatabaseSingleton {
	   private static DatabaseSingleton dbObject;

	   private DatabaseSingleton() {      
	   }

	   public static DatabaseSingleton getInstance() {

	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new DatabaseSingleton();
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	


	   public static void main(String[] args) {
		   DatabaseSingleton db1;

	      // refers to the only object of Database
	      db1= DatabaseSingleton.getInstance();
	      
	      db1.getConnection();
	   
	}
}