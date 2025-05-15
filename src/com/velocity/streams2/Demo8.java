package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {
		//8. distinct()
		//Returns a stream with duplicate elements removed, based on equals().
		
		List<Integer> nums = Arrays.asList(1, 2, 2, 3);
		List<Integer> unique = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		List<String> words = Arrays.asList("apple", "Apple", "APPLE");
		List<String> distinct = words.stream().map(String::toLowerCase).distinct().collect(Collectors.toList()); // [apple]
		
	}

}
