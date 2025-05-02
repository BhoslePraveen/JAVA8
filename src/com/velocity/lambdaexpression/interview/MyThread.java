package com.velocity.lambdaexpression.interview;
// Runnable is a interface which help us to create a Thread in java
// Here MyThread class represents a Thread
public class MyThread implements Runnable {

	// Run method represents thread activity/action.
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello velocity " + i);
		}
	}

}
