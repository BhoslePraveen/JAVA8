package com.velocity.map;

import java.util.List;

public class User {
	private String name;
    private List<Order> orders;
    
	public User(String name, List<Order> orders) {
		this.name = name;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", orders=" + orders + "]";
	}
	
}
