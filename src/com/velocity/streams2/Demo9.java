package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo9 {

	public static void main(String[] args) {
		// 9. reduce()
		// Performs an accumulation (sum, concat, etc.) and returns an Optional<T>.
		// If your logic has to reduce many elements into one result, use reduce().
		// The identity is a starting point and default value in case the stream is empty.
		// For sum → identity = 0
		// For product → identity = 1
		// For string concat → identity = ""
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3);
		int sum = nums.stream().reduce(0, (a, b) -> a + b); // 6
		System.out.println(sum);
		
		
		List<String> list = Arrays.asList("A", "B", "C");
		String result = list.stream().reduce("", (a, b) -> a + b); // "ABC"
		System.out.println(result);
		
		List<Integer> numbers = Arrays.asList(2, 3, 4);
		int product = numbers.stream().reduce(1, (a, b) -> a * b); // Output: 24
		System.out.println(product);


	}

}
