package com.velocity.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("A", "B"), Arrays.asList("C", "D"));
		
		System.out.println(nestedList);

		List<String> flatList = nestedList.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());

		System.out.println(flatList);
	}

}
