package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		// 5. anyMatch()
		// Returns true if any element matches the predicate.
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		boolean anyEven = list.stream().anyMatch(n -> n % 2 == 0); // true
		
		List<String> names = Arrays.asList("A", "B", "Admin");
		boolean hasAdmin = names.stream().anyMatch(s -> s.equalsIgnoreCase("admin")); // true
		
		List<String> emails = Arrays.asList("a@a.com", "b@.com");
		boolean anyInvalid = emails.stream().anyMatch(e -> !e.contains("@")); // true
		System.out.println(anyInvalid);

	}

}
