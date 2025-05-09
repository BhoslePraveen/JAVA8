package com.velocity.methodreference;

public class Test {

	public static void main(String[] args) {
		// instead of () -> Utils.sayHello()
		Runnable r = Utils::sayHello; 
        r.run();
	}

}
