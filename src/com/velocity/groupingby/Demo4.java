package com.velocity.groupingby;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		//  Find Duplicate Characters in a String
		// Input : Programming
		// Output : {r=2,m=2,g=2}
		
		String input = "Programming";
		
		Map<Character, Long> result = input.chars()
				.mapToObj(num -> (char) num)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet().stream()
				.filter(entry-> entry.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(result);
		

	}

}
