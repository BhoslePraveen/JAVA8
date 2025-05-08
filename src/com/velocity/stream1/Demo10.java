package com.velocity.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo10 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Praveen","Kiran","Pooja","Ravi","Priyanka");
		
		List<String> pNames = names.stream()
		.filter(name -> name.startsWith("P"))
		.collect(Collectors.toList());
		
		System.out.println(pNames);

	}

}
