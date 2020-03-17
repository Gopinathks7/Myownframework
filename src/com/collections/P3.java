package com.collections;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args)
	{
		String primenumber="";
		System.out.println("Enter an number to find prime number:-");
		Scanner scan= new Scanner(System.in);
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			int counter=0;
			for(int num=i;num>=1;num--)
			{
			if(i%num==0)
			{
				counter=counter+1;
			}
			}
			if(counter==2)
			{
				primenumber=primenumber+i+"  ";
				
			}
			
		}
		System.out.println(primenumber);
	}

}

