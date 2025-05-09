package com.velocity.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	// . forEach()
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Pune");
		names.add("Mumbai");
		names.add("Bangalore");
		names.add("chennai");

		// Iterator
		// ListIterator
		// For each loop
		names.forEach(name -> System.out.println(name));

	}

}
