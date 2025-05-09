package com.velocity.supplier;

import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {

		Supplier<String> supply = () -> {
			String otp = "";
			for (int i = 1; i <= 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}

			return otp;
		};
		
		System.out.println(supply.get());
		System.out.println(supply.get());
		System.out.println(supply.get());

	}

}
