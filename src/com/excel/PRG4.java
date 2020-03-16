package com.excel;

import java.util.Scanner;

public class PRG4 {

	public static void main(String[] args) 
	{
		boolean leap=true;
		System.out.print("Enter an year==>:");
		Scanner scan = new Scanner(System.in);
		int year=scan.nextInt();
		if(year%4==0)
		{
			 if(year% 100==0)
			 {
				 if(year%400==0)
					 leap=true;
				 else
					 leap=false;
					 
			 }
			 else
			 leap =true;
		}
		else
		leap=false;
		
		
	

if(leap)

	System.out.print("Entered is leap Year"+year);
	else
		System.out.println("Entered year is not leap years"+year);
}
}

