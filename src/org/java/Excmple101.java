package org.java;

import java.util.Scanner;

public class Excmple101 {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter an year");
		Scanner scan = new Scanner(System.in);
		int year=scan.nextInt();
		Boolean flag= true;
		
		if(year%4==0)
		{
			  if(year%100==0)
			  {
				   if(year%400==0)
					   
					   flag=true;
					   else
						   flag=false;
			  }
			    flag=true;
		}
			    else
			    	flag=false;
			  
	if(flag)
	
		System.out.println(" year is leap "+year);
		else
			System.out.println(" year is not  leap "+year);
		
	}

}
