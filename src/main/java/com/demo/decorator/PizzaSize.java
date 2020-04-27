package com.demo.decorator;

public class PizzaSize extends PizzaDecorator{

	private String pizzaSize;
	private double sizeCost;
	
	public PizzaSize(String pizzaSize, Pizza pizza) {
		super(pizza);
		this.pizzaSize = pizzaSize;
	}
	@Override
	public void setCost() {
		if(pizzaSize.equals("Personal 7\""))
			sizeCost = 1;
		else if(pizzaSize.equals("Small 9.5\""))
			sizeCost = 2;
		else if(pizzaSize.equals("Medium 11.5\""))
			sizeCost = 3;
		else if(pizzaSize.equals("Large 13.5\""))
			sizeCost = 4;
	}

	public double getCost() {
		setCost();
		return sizeCost+pizza.getCost();
	}
	

}
