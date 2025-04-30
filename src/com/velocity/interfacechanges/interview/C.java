package com.velocity.interfacechanges.interview;

public class C implements A, B {

	@Override
	public void getData() {
		A.super.getData();
		B.super.getData();
	}

}
