package com.decorator;

public class SportsCarDecorator  extends CarDecorator {

	public SportsCarDecorator (Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding sports  car features");
	}

}
