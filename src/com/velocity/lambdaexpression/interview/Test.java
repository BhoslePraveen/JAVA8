package com.velocity.lambdaexpression.interview;

public class Test {

	public static void main(String[] args) {
		Runnable runnable = ()->{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Java from velocity " + i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.run(); // thread.start();
		
	}

}
