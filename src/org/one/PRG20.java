package org.one;

import java.util.Calendar;
import java.util.Scanner;



public class PRG20 
{
	   
	public static  int countWeekendDays(int year, int month) 
	{
		
		int weekendamount=5;
		int amoutexcludingweekend=4;
		int total=0;


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
	    int totalweekendamount=count*weekendamount;
	    int sumtotal=amoutexcludingweekend *days;
	    total=totalweekendamount+sumtotal;
	    System.out.println("Number of saturday & Sunday is "+count);
	    System.out.println("Number of days in the manth is "+daysInMonth);
	    System.out.println("Total number of day excluding weekends is "+days);
	    System.out.println("Total weekend amount is "+totalweekendamount);
	    System.out.println("Total amount of week days is "+sumtotal);
	    System.out.println("The Total amount of the month is "+total);
	    return count;
	}
	public static void main(String[] args) 
	{
	
		countWeekendDays(2020, 10);
		
	}

}
