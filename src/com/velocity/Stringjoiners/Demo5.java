package com.velocity.Stringjoiners;

import java.util.StringJoiner;

public class Demo5 {

	public static void main(String[] args) {
		StringJoiner joiner1 = new StringJoiner(", ");
		joiner1.add("Dog").add("Cat");

		StringJoiner joiner2 = new StringJoiner(", ");
		joiner2.add("Cow").add("Goat");

		joiner1.merge(joiner2);

		System.out.println(joiner1);

	}

}
