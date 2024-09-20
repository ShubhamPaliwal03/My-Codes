package com.dev.shubhampaliwal;
import java.util.*;

public class Cart {

	private List<CartItem> cartItems;
	private double total_bill_amount;
	
	public Cart() {
		
		cartItems = new ArrayList<CartItem>();
	}
	
	public void addProduct(String product_name, double price, int quantity) {
		
		CartItem item = new CartItem(product_name, price, quantity);
		
		cartItems.add(item);
		
		total_bill_amount += price * quantity;
	}
	
	public List<CartItem> getCartItems() {
		
		return cartItems;
	}
	
	public double getTotalBillAmount() {
		
		return total_bill_amount;
	}
	
	public int getCartItemCount() {
		
		return cartItems.size();
	}
}