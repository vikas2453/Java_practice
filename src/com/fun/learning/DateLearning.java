package com.fun.learning;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date oldDate= new Date();
		System.out.println(oldDate);
		
		Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
		// Calender's set method takes int and we can pass any value in month and dates
		// january was 0, and same while retrieving we needed to add 1. 
		localCalendar.set(1964, 13, 34);
		
		int currentMonth=localCalendar.get(Calendar.MONTH);
		
		System.out.println(localCalendar);
		System.out.println(currentMonth);
		
		LocalDate newDate= LocalDate.now();
		System.out.println("Local Date in java 8 without time:--> "+newDate);

	}

}
