package com.velocity.streams2;

import java.util.Arrays;
import java.util.Optional;

public class Demo7 {

	public static void main(String[] args) {
		// 7. findFirst()
		// Returns the first element in encounter order.
		
		Optional<String> first = Arrays.asList("A", "B").stream().findFirst(); // Optional[A]
		
		
		Optional<Integer> firstEven = Arrays.asList(1, 2, 4).stream().filter(n -> n % 2 == 0).findFirst(); // 2
	}

}
