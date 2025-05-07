package com.velocity.methodreference;

import java.util.function.Supplier;

public class Test3 {

	//T get();
	public static void main(String[] args) {
		// Using Lambda
        Supplier<MyClass> lambdaSupplier = () -> new MyClass();
        MyClass obj1 = lambdaSupplier.get(); // Output: Constructor called!

        // Using Constructor Reference
        Supplier<MyClass> methodRefSupplier = MyClass::new;
        MyClass obj2 = methodRefSupplier.get(); // Output: Constructor called!

	}

}
