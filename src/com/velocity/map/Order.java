package com.velocity.map;

public class Order {
	private String item;
	
	public Order(String item) {
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [item=" + item + "]";
	}
	
	
}
