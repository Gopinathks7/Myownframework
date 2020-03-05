package com.pattrens;

import java.util.Scanner;

public class Arms 
{
	
	public static void rma()
	{
		int number=10;
		long l=(int)number;
		System.out.println(l);
	}
	public static void main(String[] args) {
	int num=0;
	int sum=0;
	int temp=0;
	int r=0;
	
	System.out.println("Enter an number");
	Scanner scan= new Scanner(System.in);
	num=scan.nextInt();
	temp=num;
	scan.close();
	while(temp!=0)
	{
		r=temp%10;
		sum=sum+r*r*r;
		temp=temp/10;
	}
	if(num==sum)
	System.out.println("Entered number is armstrong");
	else
		System.out.println("Entered number is not  armstrong");
	
		 
	}

	}


