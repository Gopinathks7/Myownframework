package com.practise;

import java.util.Scanner;

public class Excemple4 {

	public static void main(String[] args) 
	{
		System.out.println("Enter an Year");
		Scanner sca= new Scanner(System.in);
		boolean leap=true;
		int year=sca.nextInt();
		if(year%4==0)
		{
			  if(year%100==0) 
			  {
				    if(year%400==0)
				    	leap=false;
				    else
				    	leap=true;
			  }
			  else
			  leap=true;
		}
		else
		   leap=false;
			  
	if(leap)
	
		System.out.println("Year "+year+"Is Leap");
		else
			System.out.println("Year "+year+"Is Leap");
		

	}

}
