package com.demo.decorator;

import java.util.ArrayList;

public class Pizza {
	//Pizza items taken reference from Dominos.ie
	String pizzaSize, crust, sauce, cheese;
	ArrayList<String> toppings;
	double cost;
	
	public Pizza(double cost) {
		this.cost = cost;
	}
		public double getCost() {
		return cost;
	}
	public void setCost() {
		
	}
}
