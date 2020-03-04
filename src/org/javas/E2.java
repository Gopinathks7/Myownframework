package org.javas;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args)
	{
		Boolean leap=true;
	System.out.println("Enter year");
	Scanner scan = new Scanner(System.in);
	int year=scan.nextInt();
	if(year%4==0)
	{
		  if( year%100==0)
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

	System.out.println("year  is leap " +year);
else
	System.out.println("year  is Not leap " +year);

}
}
