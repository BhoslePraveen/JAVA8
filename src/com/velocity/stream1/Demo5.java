package com.velocity.stream1;

import java.util.stream.Stream;

public class Demo5 {

	public static void main(String[] args) {
		// Using Stream.generate()

		Stream<Double> stream = Stream.generate(Math::random).limit(100000);
		
		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));
	}

}
