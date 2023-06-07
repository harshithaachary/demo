package com.proxy;

public class ProxyTestingMain {
	
	
	public static void main(String[] args) {
		
		String empName = "Arjun Kumar";
		
		OfficeInternetAccess access = new ProxyInternetAccess(empName);
		
		System.out.println("Lenght of the name : " + empName.length());
		
		access.grantInternetAccess();
		
	}

}
