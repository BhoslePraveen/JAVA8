package com.velocity.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); //"yyyy-MM-dd"
		System.out.println(date);
		
		date = date.plusDays(3);
		System.out.println(date);
		
		date = date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(1);
		System.out.println(date);
		
		boolean leapYear = LocalDate.parse("2024-01-25").isLeapYear();
		System.out.println(leapYear);
		
		boolean before = LocalDate.parse("2025-01-25").isBefore(LocalDate.parse("2024-12-24"));
		System.out.println(before);
		
		Period between = Period.between(LocalDate.parse("2025-01-25"), LocalDate.parse("2024-12-24"));
		System.out.println(between);
		
		Duration between2 = Duration.between(LocalTime.parse("05:00"), LocalTime.now());
		System.out.println(between2);
	}

}
