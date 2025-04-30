package com.velocity.interfacechanges.interview;

public interface A {

	default void getData() {
		System.out.println("Interface A : Data");
	}

}
