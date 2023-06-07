package com.decorator;

public class IcecreamDecorator implements Icecream {

	
	protected Icecream icecream;
	public IcecreamDecorator(Icecream icecream)
	{
		this.icecream =icecream;
	}
	@Override
	public void flavour() {
		// TODO Auto-generated method stub
		this.icecream.flavour();
	}
	

}
