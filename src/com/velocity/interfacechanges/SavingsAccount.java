package com.velocity.interfacechanges;

public class SavingsAccount implements BankAccount {
	private double balance;

	// Parameterized Constructor
	public SavingsAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void printWelcomeMessage() {
		System.out.println("Welcome to your Savings Account. Earn more interest!");
	}

	public void getMsg() {
		BankAccount.super.printWelcomeMessage();
	}
}
