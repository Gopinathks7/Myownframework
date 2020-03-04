package com.pattrens;

import java.util.Scanner;

public class PRG4 {

	public static void main(String[] args) 
	{
		Boolean leap=true;
	System.out.println("Enter an Year");
	Scanner scan= new Scanner(System.in);
	int year=scan.nextInt();
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
	

	
if(leap==true)
System.out.println("Year is leap");
else
	System.out.println("Year is not leap");
}

}

