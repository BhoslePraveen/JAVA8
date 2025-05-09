package com.velocity.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Praveen", "ajay", "Ravi");

		// Lambda version
		//Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));
		
		// Method reference version
        Collections.sort(names, String::compareToIgnoreCase);

		System.out.println(names);

	}

}
