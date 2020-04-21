package org.one;


import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

public class PRG19 {

	public static void main(String[] args) 
	{
		int count=0;
	int fivedaysamount=25;
	int Sunday=0;
	int Saturday=0;
	int totalamount=0;
		Calendar calendar = Calendar.getInstance();
	      System.out.println("Day: " + (calendar.get(Calendar.DATE)));
	      System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
	      System.out.println("Year: " + (calendar.get(Calendar.YEAR)));
	      String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	      System.out.println("Current day = " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
	      
	      for(int j=0;j<days.length;j++)
	      {
	    	  if(days[j].equalsIgnoreCase("Sunday") ||days[j].equalsIgnoreCase("Saturday") )
	    	  {
	    		  count++;
	    	  }
	      }
	      for(int i=0;i<days.length;i++)
	      {
	 if(days[i].equalsIgnoreCase("Sunday") ||days[i].equalsIgnoreCase("Saturday") )
			 {
		 Sunday=10;
		 Saturday=10;
			 }
	 
	
	 	 		   	
	}
	      System.out.println("The Number of saturday ");
	}
}
