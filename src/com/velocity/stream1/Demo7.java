package com.velocity.stream1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Demo7 {

	public static void main(String[] args) {
		// Primitive Streams
		
		IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4
		LongStream longStream = LongStream.of(1L, 2L, 3L);
		
		intStream.forEach(System.out::println);
		longStream.forEach(System.out::println);

	}

}
