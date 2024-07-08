package com.dev.shubhampaliwal;

public class CartItem {
	
	private String product_name;
	private double price;
	private int quantity;
	
	public CartItem(String product_name, double price, int quantity) {
		
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProductName() {
		
		return product_name;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public int getQuantity() {
		
		return quantity;
	}
}