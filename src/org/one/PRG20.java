package org.one;

import java.util.Calendar;
import java.util.Scanner;



public class PRG20 
{

	public static  int countWeekendDays(int year, int month) {
	  
		Calendar calendar = Calendar.getInstance();
	     calendar.set(year, month - 1, 1);
	    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	    int count = 0;
	    for (int day = 1; day <= daysInMonth; day++) 
	    {
	        calendar.set(year, month - 1, day);
	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) 
	        {
	            count++;
	          
	        }
	    }
	    System.out.println("Number of saturday & Sunday is "+count);
	    System.out.println(daysInMonth);
	    return count;
	}
	public static void main(String[] args) 
	{
	
		countWeekendDays(2020, 2);
	}

}
