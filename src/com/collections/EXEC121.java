package com.collections;

import java.util.Scanner;

public class EXEC121 {

	public static void main(String[] args)
	{
	
		int number=0;
		int sum=0;
		int temp=0;
		int r=0;
		System.out.println("Enter an number");
		Scanner scan= new Scanner(System.in);
		number=scan.nextInt();
		temp=number;
		while(temp!=0)
		{
			    r=temp%10;
			    sum=sum+r*r*r;
			    temp=temp/10;
		}
if(number==sum)
	System.out.println("ARMS");
else
	System.out.println("Not");
	}

}
