package org.hackerrank;

import java.util.Scanner;

public class Day3
{
 
	public static void main(String[] args) 
	{
	System.out.println("Enter an number");
	Scanner scan = new Scanner(System.in);
	int  n=scan.nextInt();
	
	if(n%2!=0)
	
	{
		System.out.println("Weird");
	}
	else if (n>=2 && n<=5)
	{
		System.out.println("Not Weird");
	}
	
	else if (n>=6 && n<=20)
	{
		System.out.println("Weird");
	}
		
	else 
	{
		System.out.println("Not Weird");
	}
	}
	}


