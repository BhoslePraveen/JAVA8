package com.velocity.predicate;

import java.util.function.Predicate;

public class Interview1 {

	public static void main(String[] args) {

		String[] names = { "Anushka", "Anupma", "Deepika", "Kajol", "Veera" };

		// Question : Print all the names starting with 'A'.

		Predicate<String> check = name -> name.charAt(0) == 'A';

		for (String name : names) {

			if (check.test(name)) {
				System.out.println(name);
			}
		}

	}

}
