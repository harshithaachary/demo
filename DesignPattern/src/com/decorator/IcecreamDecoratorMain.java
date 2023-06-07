package com.decorator;

public class IcecreamDecoratorMain {

	public static void main(String[] args) {
	
			
			
			Icecream choclate = new ChoclateDecorator(new IcecreamFlavour());
			 choclate.flavour();

				Icecream butterscotch = new ButterscotchDecorator(new IcecreamFlavour());
				 butterscotch.flavour();

					Icecream strawberry = new StrawberryDecorator(new IcecreamFlavour());
					strawberry.flavour();
			
			
		}

	}