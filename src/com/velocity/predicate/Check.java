package com.velocity.predicate;

import java.util.function.Predicate;

public class Check implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t > 10;
	}

}
