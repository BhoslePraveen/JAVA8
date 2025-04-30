package com.velocity.interfacechanges.interview;

public interface B {
	
	default void getData() {
		System.out.println("Interface B : Data");
	}
}
