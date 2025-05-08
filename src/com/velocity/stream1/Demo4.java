package com.velocity.stream1;

import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		// Using Stream.builder()
		Stream<String> stream = Stream.<String>builder()
			    .add("Java")
			    .add("Python")
			    .add("JavaScript")
			    .add("Spring Boot")
			    .add("Angular")
			    .build();
		
		
		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));
		

	}

}
