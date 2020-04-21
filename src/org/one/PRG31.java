package org.one;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class PRG31 {

	public static void main(String[] args) 
	{
		
		LocalDate local=LocalDate.now();
		int day=local.getDayOfMonth();
		DayOfWeek days=local.getDayOfWeek();
		Month month=local.getMonth();
		int year=local.getYear();
		System.out.println(days+"   ");
		System.out.println(month+"  ");
		System.out.println(year+"   ");
		System.out.println(day+"   ");
		
	

	}

}
