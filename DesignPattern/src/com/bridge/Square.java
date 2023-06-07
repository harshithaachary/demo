package com.bridge;
public class Square extends Shape {

	public Square(Colour colour) {
		super(colour);
	}
	
	@Override
	public void applyColour() {
		System.out.println("Applying colour to square");
		colour.applyColour();
	}

}