package com.velocity.map;

import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		numbers.stream().map(i -> i * i).forEach(System.out::println);

		List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
		stringList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

	}

}
