package org.today;

import java.util.Scanner;

public class PRG2 {

	public static void main(String[] args) 
	{
boolean leap=true;
System.out.println("Enter an years");
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
	 leap=true;
}
else
	 leap =false;

	if(leap)
	
	System.out.println("The Entered year is Leap   "+year);
	else
		
		System.out.println("The Entered year is Not Leap   "+year);
}
	
	
	}

	


