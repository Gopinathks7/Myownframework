package org.java;

import java.util.Scanner;

public class Excemple21 {

	public static void main(String[] args) 
	{
		System.out.println("Enter year");
		Scanner scan= new Scanner(System.in);
		int year=scan.nextInt();
		boolean leap=true;
		if(year%4==0)
		{
			 if(year%100==0)
				 
			 {
				 if(year%400==0)
					 
					 leap=true;
					 else
						 leap =false;
		}
		else
			leap=true;
	
		}
		else
	
			leap=false;
	
		if(leap)
		
			System.out.println("YEAR==>"+year+" is leap year");
			else
				System.out.println("YEAR==>"+year+"  is not  leap year");
		

	}

}
