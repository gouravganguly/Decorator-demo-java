package com.demo.decorator;

public class PizzaCheese extends PizzaDecorator{
	
	private String pizzaCheese;
	private double cheeseCost=0;
	
	public PizzaCheese(String pizzaCheese, Pizza pizza) {
		super(pizza);
		this.pizzaCheese = pizzaCheese;
	}
	
	@Override
	public void setCost() {
		if(pizzaCheese.equals("Reduced Fat Cheese")) 
			cheeseCost = 2;
		else if(pizzaCheese.equals("Mozarella Cheese"))
			cheeseCost = 2;
	}
	
	public double getCost() {
		setCost();
		return cheeseCost+pizza.getCost();
	}
}
