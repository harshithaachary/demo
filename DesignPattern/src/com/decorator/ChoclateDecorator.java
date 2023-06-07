package com.decorator;

public class ChoclateDecorator extends IcecreamDecorator  {

	public ChoclateDecorator(Icecream icecream) {
		super(icecream);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Its a choclate flavour");
	}


}
