package com.collections;

import java.util.Calendar;

   class EXEC9 {

	public static void main(String[] args) 
	{
	Calendar c1= Calendar.getInstance();
	Calendar c2= Calendar.getInstance();
	c1.set(2012, 2, 12);
	 c2.set(2011, 2, 12);
	long dc1=c1.getTimeInMillis();
	long dc2=c2.getTimeInMillis();
	long diff=dc1-dc2;
	long sec=diff/1000;
	long min=diff/(60*1000);
	long hrs=diff/(60*60*1000);
	long days=diff/(24*60*60*1000);
	System.out.println(sec);
	System.out.println(min);
	System.out.println(hrs);
	System.out.println(days);
	}

}
