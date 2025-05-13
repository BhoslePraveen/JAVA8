package com.velocity.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		
		 // Creating a list of prime numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        
        // Creating a list of odd numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        
        // Creating a list of even numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Combining the above lists into a list of lists
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        // Printing the structure before flattening
        System.out.println("The Structure before flattening is : " + listOfListofInts);

        // Flattening the list of lists into a single list using flatMap
        List<Integer> listofInts = listOfListofInts.stream()
                                    .flatMap(list -> list.stream())
                                    .collect(Collectors.toList());

        // Printing the structure after flattening
        System.out.println("The Structure after flattening is : " + listofInts);
	}

}
