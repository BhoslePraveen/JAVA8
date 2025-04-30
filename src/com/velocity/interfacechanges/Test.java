package com.velocity.interfacechanges;

public class Test {

	public static void main(String[] args) {  
		SavingsAccount ba = new SavingsAccount(2000); // Loose Coupling : Dynamic Dispatch
	    ba.printWelcomeMessage();
	    ba.getMsg(); // Default method calling
	}
}
