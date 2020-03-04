package com.collections;

import java.util.Scanner;

public class EXEC78 {

	public static void main(String[] args) 
	{
		System.out.println("Enter a year");
		Scanner scan= new Scanner(System.in);
		int year=scan.nextInt();
		Boolean leap=true;
		if(year/4==0)
		{
			 if(year/100==0) {
				  if(year/400==0)
					  leap=true;
					  else
						  leap=false;
			 }
			 else
				 leap=true;
		}
		leap=false;
		
	if(leap=true)
		System.out.println("Year is leap");
	else
		System.out.println("Year is not leap");
	}

}
