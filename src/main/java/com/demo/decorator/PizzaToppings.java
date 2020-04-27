package com.demo.decorator;

import java.util.ArrayList;

public class PizzaToppings extends PizzaDecorator{
	
	private ArrayList<String> pizzaToppings; 
	private double toppingsCost=0;
	
	public PizzaToppings(ArrayList<String> pizzaToppings, Pizza pizza) {
		super(pizza);
		this.pizzaToppings = pizzaToppings;
	}
	
	@Override
	public void setCost() {
		int size  = pizzaToppings.size();
		toppingsCost =  0.5 * size; 
		//Each topping cost 0.5, so depending upon the toppings cost is calculated
	}
	
	public double getCost() {
		setCost();
		return toppingsCost+pizza.getCost();
	}
	
	
}
