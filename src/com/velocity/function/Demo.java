package com.velocity.function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function<String, Integer> convert = str -> str.length();
		convert = convert.andThen(num -> num * 3);
		
		System.out.println(convert.apply("Praveen"));

	}

}
