package com.adapter;

public class SocketTestingMain {

	public static void main(String[] args) {

		SocketAdapter socketAdapter = new SocketAdapterImpl();
		
		Volt v = socketAdapter.get11Volt();
		
		System.out.println("Voltage obtained:"+v.getVoltage());
		
		Volt v1 = socketAdapter.get55Volt();
		
		System.out.println("Voltage obtained:"+ v1.getVoltage());
		
	}

}
