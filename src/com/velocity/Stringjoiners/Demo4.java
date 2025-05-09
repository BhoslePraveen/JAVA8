package com.velocity.Stringjoiners;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Demo4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("I");
		list.add("am");
		list.add("software");
		list.add("engineer");
		list.add("pune");
		System.out.println(list);
		
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		list.forEach(p -> sj.add(p));
		System.out.println(sj);
	}

}
