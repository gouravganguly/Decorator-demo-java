package com.demo.decorator;

public class PizzaSauce extends PizzaDecorator{
	
	private String pizzaSauce;
	private double sauceCost=0;
	
	public PizzaSauce(String pizzaSauce, Pizza pizza) {
		super(pizza);
		this.pizzaSauce = pizzaSauce;
	}
	
	@Override
	public void setCost() {
		if(pizzaSauce.equals("Sundried Tomato and Garlic Sauce")) 
			sauceCost = 1;
		else if(pizzaSauce.equals("BBQ Sauce"))
			sauceCost = 1;
		else if(pizzaSauce.equals("Domino's Own Tomato Sauce"))
			sauceCost = 2;
	}
	
	public double getCost() {
		setCost();
		return sauceCost+pizza.getCost();
	}
}
