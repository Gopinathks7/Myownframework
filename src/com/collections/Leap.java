package com.collections;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) 
	{		System.out.println("Enter number to find prime number\n");
		Scanner scan= new Scanner(System.in);
		int year=scan.nextInt();
Boolean leap=false;
if(year%4==0)
{
	 if(year%100==0)
	 {
		  if(year%400==0)
		  leap=true;
		  else
			  leap=false;
	 }
	 else
	 leap=true;
}
else
	leap=false;
	
if(leap)
System.out.println("Year is leap "+year);
else
	System.out.println("Year is not leap "+year);
	}
	

}
