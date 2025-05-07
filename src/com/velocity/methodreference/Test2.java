package com.velocity.methodreference;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		LoggerService logger = new LoggerService();
		List<String> messages = Arrays.asList("Started", "Processing", "Completed");

		// Using lambda
		//messages.forEach(msg -> logger.logInfo(msg));
		
		// Using method reference to instance method of a specific object
        messages.forEach(logger::logInfo);
	}

}
