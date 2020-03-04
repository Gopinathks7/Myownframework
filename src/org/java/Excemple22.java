package org.java;

import java.util.Scanner;

public class Excemple22 {

	public static void main(String[] args) 
	{
		System.out.println("Enter Year");
		Scanner scan= new Scanner(System.in);
		int year=scan.nextInt();
		boolean leap=false;
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
		leap=false;
	
		if(leap)
			System.out.println("YEAR "+year+" IS LEAP YEAR");
		else
			System.out.println("YEAR "+year+" IS NOT  LEAP YEAR");
		}
		

	}


