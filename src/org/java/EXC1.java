package org.java;

import java.util.Scanner;

public class EXC1 {

	public static void main(String[] args)
	{
		System.out.println("Enter an year");
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
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
			 flag= false;
	
if(flag)

	System.out.println(" Year is leap==>"+year);
	else
		System.out.println(" Year is Not ==>"+year);
}
}

