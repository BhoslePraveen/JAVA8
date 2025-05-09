package com.velocity.Stringjoiners;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("I");
		list.add("am");
		list.add("software");
		list.add("engineer");
		list.add("pune");

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[");
		for (int i = 0; i < list.size(); i++) {
			stringBuffer.append(list.get(i) + ",");
		}
		stringBuffer.append("]");
		System.out.println(stringBuffer);
	}

}
