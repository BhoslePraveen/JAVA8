package com.velocity.stream1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "A", "B", "C" };
		Stream<String> stream = Arrays.stream(arr);
		
		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));
	}

}
