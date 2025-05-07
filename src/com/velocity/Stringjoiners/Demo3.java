package com.velocity.Stringjoiners;

import java.util.StringJoiner;

public class Demo3 {

	public static void main(String[] args) {
		//Delimiter: ,
        //Prefix: [
        //Suffix: ]
		StringJoiner list = new StringJoiner(", ", "[", "]");
		list.add("One");
		list.add("Two");
		list.add("Three");

		System.out.println(list);
	}

}
