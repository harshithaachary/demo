package com.decorator;

public class StrawberryDecorator extends IcecreamDecorator  {

	public StrawberryDecorator(Icecream icecream) {
		super(icecream);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Its a strawberry  flavour");
	}


}
