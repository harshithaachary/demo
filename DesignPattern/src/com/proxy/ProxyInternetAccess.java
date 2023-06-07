package com.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String empName;
	
	private ActualInternetAccess actualAccess;
	
	public ProxyInternetAccess(String empName) {
		this.empName = empName;
	}
	
	@Override
	public void grantInternetAccess() {
		if(getEmployeeLevel(empName) > 5) {
			actualAccess = new ActualInternetAccess(empName);
			actualAccess.grantInternetAccess();
		}
		else {
			System.out.println("Internet access denied because the employee is not authorized.");
		}
	}
	
	private int getEmployeeLevel(String empName) {
		if(empName.length() > 10) {
			return 6;
		}
		else
			return 4;
	}

}
