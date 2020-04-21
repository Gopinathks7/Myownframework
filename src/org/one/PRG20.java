package org.one;

import java.util.Calendar;
import java.util.Scanner;



public class PRG20 
{
	   
	public static  int countWeekendDays(int year, int month) 
	{
		int amount=0;
		int weekendamount=0;
		int dayofmonth=0;
		int weekends=0;
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
	    int days=daysInMonth-count;
	    System.out.println("Number of saturday & Sunday is "+count);
	    System.out.println("Number of days in the manth is "+daysInMonth);
	    System.out.println("Total noumber of day exculiding weekends is "+days);
	    return count;
	}
	public static void main(String[] args) 
	{
	
		countWeekendDays(2020, 1);
		
	}

}
