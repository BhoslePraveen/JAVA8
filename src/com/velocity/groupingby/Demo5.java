package com.velocity.groupingby;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		//  Count Occurrence of Each Character in a Sentence (Ignore Spaces & Case)
		// Input : Hello World
		
		String input = "Hello World";
		
		Map<Character, Long> result = input.toLowerCase().chars()
		.mapToObj(c -> (char)c)
		.filter(c -> c != ' ')
		.collect(Collectors.groupingBy(c-> c,Collectors.counting()));
		
		System.out.println(result);
		

	}

}
