package com.velocity.interfacechanges;

public interface ProductUtil {
	
	//Static method
	static double applyDiscount(double price, double percentage) {
		return price - (price * percentage / 100);
	}
}
