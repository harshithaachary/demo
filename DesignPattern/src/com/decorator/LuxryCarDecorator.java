package com.decorator;

public class LuxryCarDecorator extends CarDecorator {

	public LuxryCarDecorator(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding luxury car features");
	}

}
