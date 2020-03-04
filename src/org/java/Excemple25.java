package org.java;

import java.util.Calendar;

public class Excemple25 {

	public static void main(String[] args) 
	{
	Calendar c1= Calendar.getInstance();
	Calendar c2= Calendar.getInstance();
	 c1.set(2012, 2, 12);
	 c2.set(2011, 3, 12);
	long calender1diff=c1.getTimeInMillis();
	long calender2diff=c2.getTimeInMillis();
	long diff=calender1diff-calender2diff;
	
	long sec=diff/1000;
	long min=diff/(60*1000);
	long hours=diff/(60*60*1000);
	long days=diff/(24*60*60*1000);
	
System.out.println(sec);
System.out.println(min);
System.out.println(hours);
System.out.println(days);
	}

}
