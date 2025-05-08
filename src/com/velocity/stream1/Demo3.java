package com.velocity.stream1;

import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		// Using Stream.of()
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		
		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));

	}

}
