package com.velocity.dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		// Covert String Date
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date2 = sf.parse("2022-10-08");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
