package com.codingdojo.fruityloops.models;

public class Item {
	
	
	// Member Variables
	private String name;
	private double price;
	
	
	
	/**
	 * @param name
	 * @param price
	 */
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	// GETTERS and SETTERS
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
