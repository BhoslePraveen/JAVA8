package com.velocity.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	// . forEach()
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Pune");
		names.add("Mumbai");
		names.add("Bangalore");
		names.add("chennai");

		names.removeIf(name -> name.equals("Mumbai"));
		names.forEach(n-> System.out.println(n));
	}

}
