package org.java;

import java.util.Scanner;

public class Excemple24 {

	public static void main(String[] args) 
	{
System.out.println("Enter an Year");
Scanner scan= new Scanner(System.in);
int year=scan.nextInt();
Boolean leap=true;
if(year%4==0)
{
	if(year%100==0)
	{
		if(year%400==0)
			leap=false;
			else
			leap=true;
	}
	leap=false;
}
leap=true;
if(leap==true)

System.out.println("  YEAR "+year+" Year is leap year ");
else
	System.out.println(" YEAR "+year+" Year is Not  leap year ");

	}

}
