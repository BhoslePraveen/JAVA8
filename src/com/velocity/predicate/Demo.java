package com.velocity.predicate;

public class Demo {

	public static void main(String[] args) {
		// Before java 8
		Check check = new Check();
		System.out.println(check.test(7));
		System.out.println(check.test(11));
	}

}
