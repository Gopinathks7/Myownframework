package org.hackerrank;

import java.util.Scanner;

public class Day9 
{
	public static int  factorial(int i)
	{
		
		int fact=i;
		
		if(i<1)
		{
return	1;
	}
		else
		{
			fact=fact*factorial(i-1);
			
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
	System.out.println(factorial(number));
scan.close();
	}

}
