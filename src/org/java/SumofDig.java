package org.java;

import java.util.Scanner;

public class SumofDig {

	public static void main(String[] args) 
	{
		System.out.println("Enter something");
		
	Scanner scan= new Scanner(System.in);	
	String name=scan.next();
	int sum=0;
	char ch[]=name.toCharArray();
	for(char b :ch)
	{
		if(b>'0'&&b<'9')
		{
			int number=Integer.parseInt(String.valueOf(b));
			sum=sum+number;
		}
	}
	System.out.println(sum);
	}

}
