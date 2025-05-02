package com.velocity.lambdaexpression;

public class Test {

	public static void main(String[] args) {
		// Note 1 : Functional Interface acts as a
		// data type for lambda expression
		
		// Note 2 : Lambda expression is used to provide 
		// Implementation of abstract method. so, No Need of 
		// separate implementation class
		
		Employee emp1 = () -> "Admin Incharge";
		
		//Calling of abstract method.
		System.out.println(emp1.getName());
		
		Employee emp2 = () -> "HR Head";
		//Calling of abstract method.
		System.out.println(emp2.getName());
	}

}
