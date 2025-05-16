package com.velocity.groupingby;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		// Interview Question 2 : Count Frequency of Each Word in a Sentence
		// Input: "apple banana apple orange banana apple"
		// Output: {apple=3, banana=2, orange=1}

		String input = "apple banana apple orange banana apple";

		Stream<String> inputStr = Arrays.stream(input.split(" "));

		Map<String, Long> result = inputStr.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		
		System.out.println(result);

	}

}
