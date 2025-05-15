package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// 1. average() (Used with mapToInt(), mapToDouble(), etc.)
		// Returns an OptionalDouble.
		
		List<Integer> nums = Arrays.asList(10, 20, 30);
		double avg = nums.stream().mapToInt(i -> i).average().orElse(0);
		System.out.println(avg); // Output: 20.0
		
		List<Double> prices = Arrays.asList(100.5, 200.0, 300.5);
		double avgPrice = prices.stream().mapToDouble(p -> p).average().orElse(0);
		System.out.println(avgPrice); // Output: 200.333...
	}

}
