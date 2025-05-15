package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo6 {

	public static void main(String[] args) {
		// 6. findAny()
		// Returns any element, may not be the first; useful in parallel streams.

		Optional<String> any = Arrays.asList("A", "B","1","a").stream().findAny();
		any.ifPresent(System.out::println);

		Optional<Integer> anyEven = Arrays.asList(1, 2, 3, 5, 6, 7)
				.stream().filter(n -> n % 2 == 0).findAny();
		
		List<String> names = Arrays.asList("admin", "user", "guest", "user2");
		Optional<String> user = names.stream().filter(n -> n.startsWith("u")).findAny();
		user.ifPresent(System.out::println);


	}

}
