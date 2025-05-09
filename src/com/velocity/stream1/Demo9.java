package com.velocity.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,20,25,30);
		
		List<Integer> evenNumbers = numbers.stream()
		.filter(num -> num%2==0)
		.collect(Collectors.toList());
		
		System.out.println(numbers);
		
		System.out.println(evenNumbers);
	

	}

}
