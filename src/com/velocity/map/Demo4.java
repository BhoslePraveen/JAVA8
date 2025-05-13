package com.velocity.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
			    new User("Praveen", Arrays.asList(new Order("Book"), new Order("Pen"))),
			    new User("Sara", Arrays.asList(new Order("Laptop"))),
			    new User("Vikas", Arrays.asList(new Order("Bag"),new Order("Shoes")))
			);
		
		System.out.println(users);
		
		// Using map() – Get Only User Names
		List<String> userNames = users.stream()
			    .map(user -> user.getName())
			    .collect(Collectors.toList());
		
		System.out.println(userNames);
		
		//Using map() – Get List of Each User's Orders (Nested Lists)
		List<List<Order>> ordersList = users.stream()
			    .map(user -> user.getOrders())
			    .collect(Collectors.toList());
		
		System.out.println(ordersList);
		
		//Using flatMap() – Flatten All Orders into One List
		List<Order> allOrders = users.stream()
			    .flatMap(user -> user.getOrders().stream())
			    .collect(Collectors.toList());

			System.out.println(allOrders);
			
	   //Using map() + map() – Get Uppercased Order Item Names per User (Nested List)
			List<List<String>> upperItems = users.stream()
				    .map(user -> 
				        user.getOrders().stream()
				            .map(order -> order.getItem().toUpperCase())
				            .collect(Collectors.toList())
				    )
				    .collect(Collectors.toList());

				System.out.println(upperItems); 
				
	   //Using flatMap() + map() – Flatten and Uppercase All Order Items
			List<String> flatUpperItems = users.stream()
					    .flatMap(user -> user.getOrders().stream())
					    .map(order -> order.getItem().toUpperCase())
					    .collect(Collectors.toList());

					System.out.println(flatUpperItems); 

	}

}
