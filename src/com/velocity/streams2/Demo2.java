package com.velocity.streams2;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// 2. count()
		//Counts the number of elements.
		List<String> names = Arrays.asList("A", "B", "C");
		long count = names.stream().count(); 
		
		
		long evenCount = Arrays.asList(1, 2, 4, 5)
				.stream()
				.filter(n -> n % 2 == 0)
				.count(); // 2
		System.out.println(evenCount);

	}

}
