package com.velocity.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		// From Collections
		List<String> list = Arrays.asList("A", "B", "C");
		Stream<String> stream = list.stream();

		stream.forEach(System.out::println);
		// or .forEach(e -> System.out.println(e));
	}

}
