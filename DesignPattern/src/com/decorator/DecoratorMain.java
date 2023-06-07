package com.decorator;
public class DecoratorMain {
	
	public static void main(String[] args) {
		
		
		Car sportsCar = new SportsCarDecorator(new BasicCar());
		sportsCar.assemble();
		
		Car luxuryCar = new LuxryCarDecorator(new BasicCar());
		luxuryCar.assemble();
		
		
		
	}

}

