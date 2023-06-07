package com.bridge;

public class BridgeTestingMain {
	
	
	public static void main(String[] args) {
		
		
		Shape square = new Square(new RedColour());
		square.applyColour();
		
		Shape triangle = new Triangle(new GreenColour());
		triangle.applyColour();
		
		
		
	}

}
