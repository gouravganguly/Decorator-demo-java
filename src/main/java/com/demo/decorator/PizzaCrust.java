package com.demo.decorator;

public class PizzaCrust extends PizzaDecorator{
	
	private String pizzaCrust;
	private double crustCost=0;
	
	public PizzaCrust(String pizzaCrust, Pizza pizza) {
		super(pizza);
		this.pizzaCrust = pizzaCrust;
	}
	
	public String getCrust() {
		return pizzaCrust;
	}
		
	@Override
	public void setCost() {
		if(pizzaCrust.equals("Classic Crust")) 
			crustCost = 1;
		else if(pizzaCrust.equals("Italian Style"))
			crustCost = 2;
		else if(pizzaCrust.equals("Thin & Crispy"))
			crustCost = 3;

	}
	
	public double getCost() {
		setCost();
		return crustCost+pizza.getCost();
	}
	
}
