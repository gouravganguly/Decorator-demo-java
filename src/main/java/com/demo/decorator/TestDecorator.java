package com.demo.decorator;

import java.util.ArrayList;

public class TestDecorator {
	//Function to verify working of decorator using console
	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Stuff");
		arrlist.add("Stuff2");
		Pizza custom3Pizza = new PizzaToppings(arrlist, new PizzaCheese("Mozarella Cheese", new PizzaSauce("BBQ Sauce", new PizzaCrust("Italian Style", new PizzaSize("Medium 11.5\"",new Pizza(0))))));
		System.out.println(custom3Pizza.getCost());
	}

}
