package com.velocity.interfacechanges;

public class CurrentAccount implements BankAccount {
	private double balance;

	// Parameterized Constructor
	public CurrentAccount(double balance) {
        this.balance = balance;
    }

	@Override
	public double getBalance() {
		return balance;
	}
	
	// No override: uses default method from interface
}
