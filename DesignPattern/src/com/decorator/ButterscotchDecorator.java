package com.decorator;

public class ButterscotchDecorator extends IcecreamDecorator  {

	public ButterscotchDecorator(Icecream icecream) {
		super(icecream);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Its a butterscotch flavour");
	}


}
