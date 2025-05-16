package com.velocity.groupingby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// Interview Question 1 : Count Frequency of Each Character in a String
		// Input: "banana"
		// Output: {b=1, a=3, n=2}

		String input = "banana";

		Map<Character, Long> result = input.chars()
		.mapToObj(num -> (char) num)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		List<char[]> asList = Arrays.asList(input.toCharArray());
		
		System.out.println(result);
		

	}

}
