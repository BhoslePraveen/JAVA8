package com.velocity.stream1;

import java.util.stream.Stream;

public class Demo6 {

	public static void main(String[] args) {
		// Using Stream.iterate()
		
		Stream<Integer> stream = Stream.iterate(0, n -> n + 2).limit(5);
		
		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));
		

	}

}
