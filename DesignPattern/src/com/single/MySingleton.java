package com.single;

public class MySingleton {

	private static MySingleton obj;
	
	private static int noOfObjects;
	private MySingleton() {
	
	}
	
	public void display()
	{
		System.out.println("From inside dispaly method");
		System.out.println("Total number of objects"+noOfObjects);
	}
	
	public static MySingleton getSingletonObject() {
		if(obj == null) {
			synchronized(MySingleton.class) {
		
		if(obj == null) {
		obj = new MySingleton();
		noOfObjects++;
		}
	}
}
		return obj;
	}
}