package com.proxy;

public class ActualInternetAccess implements OfficeInternetAccess {
	
	private String empName;
	
	ActualInternetAccess(String empName ){
		this.empName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet access provided successfully to the employee : " + empName);
	}

}
