package com.velocity.functional;

import java.util.function.Consumer;

public class Print implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println("My value is :" + t);
	}
	
	// Convertion to Lambda expression
	// (String t) -> { system.out.println("My value is :" + t);}
	//  String t  ->   System.out.println("My value is :" + t);
	//         t  ->   System.out.println("My value is :" + t);

}
