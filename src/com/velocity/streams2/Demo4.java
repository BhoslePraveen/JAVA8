package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		// 4. noneMatch()
		//Returns true if no elements match the predicate.
		
		List<Integer> list = Arrays.asList(1, 3, 5);
		boolean noneEven = list.stream().noneMatch(n -> n % 2 == 0); // true
		System.out.println(noneEven);
		
		List<String> users = Arrays.asList("abc", "xyz");
		boolean noneAdmin = users.stream().noneMatch(u -> u.equalsIgnoreCase("admin")); // true
		System.out.println(noneAdmin);
	}

}
