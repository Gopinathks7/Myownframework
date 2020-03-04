package com.excel;

import java.util.Scanner;

public class Excample4 {

	public static void main(String[] args) 
	{
		String prime="";
		System.out.println("Enter an number");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			 int count=0;
			 
			 for(int n=i;n>=1;n--)
			 {
				 if(i%n==0)
				 {
					  count=count+1;
					  
				 }
			 }
				 if(count==2)
				 {
					 prime=prime+i+"   ";
				 }
			 }
		
System.out.println(prime);
	}

}
