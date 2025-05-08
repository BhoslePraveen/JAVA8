package com.velocity.stream1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		// From File
		Path path = Paths.get("C:\\Users\\sonak\\JFS-M25\\JAVA8\\src\\com\\velocity\\stream1\\file.txt");
		Stream<String> lines = Files.lines(path); // Auto-closed!
		
		lines.forEach(System.out::println);

	}

}
