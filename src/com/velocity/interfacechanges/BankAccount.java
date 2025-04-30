package com.velocity.interfacechanges;

public interface BankAccount {
	double getBalance();

	default void printWelcomeMessage() {
		System.out.println("Welcome to your bank account!");
	}
	
	default void printOffersMessage() {
		System.out.println("Discount on gold loans!");
	}
}
