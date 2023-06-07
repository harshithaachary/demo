package com.bridge;


public class Triangle extends Shape {

	public Triangle(Colour colour) {
		super(colour);
	}

	@Override
	public void applyColour() {
		System.out.println("Applying colour to triangle");
		colour.applyColour();
	}
	
	

}


