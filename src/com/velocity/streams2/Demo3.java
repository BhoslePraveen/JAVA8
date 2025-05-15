package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		// 3. allMatch()
		//Returns true if all elements match the given predicate.
		
		List<Integer> list = Arrays.asList(2, 4, 6);
		boolean allEven = list.stream().allMatch(n -> n % 2 == 0); // true
		
		List<String> names = Arrays.asList("Apple", "Apricot");
		boolean allStartWithA = names.stream().allMatch(n -> n.startsWith("A")); // true
		System.out.println(allStartWithA);
		
		List<String> emails = Arrays.asList("a@mail.com", "b@mail.com");
		boolean validEmails = emails.stream().allMatch(e -> e.contains("@")); // true


	}

}
