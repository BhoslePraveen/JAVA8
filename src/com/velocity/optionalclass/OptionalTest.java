package com.velocity.optionalclass;

import java.util.Optional;

public class OptionalTest {

//	public static void main(String[] args) {
//		Person person = new Person();
//
//		Optional.ofNullable(person)
//		.flatMap(p-> p.getName())
//		.map(name -> name.toUpperCase())
//		.orElse("Name is not available");
//		
//
//		
//	}
	
//	public static void main(String[] args) {
//		String name = "Praveen";
//		Optional<String> opt = Optional.of(name);
//		System.out.println(opt);
//		
//		String nullName = null;
//		Optional<String> opt1 = Optional.of(nullName);
//		System.out.println(opt1);
//	}
	
	public static void main(String[] args) {
		String name = "Praveen";
		Optional<String> opt = Optional.ofNullable(name);
		System.out.println(opt);
		
		String nullName = null;
		Optional<String> opt1 = Optional.ofNullable(nullName);
		System.out.println(opt1);
	}

}
