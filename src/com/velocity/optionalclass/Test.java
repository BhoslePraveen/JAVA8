package com.velocity.optionalclass;

public class Test {

	public static void main(String[] args) {
		Person person = new Person();

		if (person != null) {
			String name = person.getName();
			if (name != null) {
				System.out.println(name.toUpperCase());
			} else {
				System.out.println("Name is missing...");
			}

		} else {
			System.out.println("Person is not found...");
		}

	}

}
