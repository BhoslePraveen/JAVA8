package com.velocity.Stringjoiners;

import java.util.StringJoiner;

public class Demo2 {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner("@ ","{","}");
		joiner.add("Apple");
		joiner.add("Banana");
		joiner.add("Orange");
		System.out.println(joiner);
	}

}
