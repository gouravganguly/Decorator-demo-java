package com.demo.decorator;


public abstract class PizzaDecorator extends Pizza{
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		super(0);
		this.pizza = pizza;
	}
}
