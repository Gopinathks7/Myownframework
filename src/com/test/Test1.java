package com.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)
	{
		System.out.println("Enter the array number");
		Scanner scan = new Scanner(System.in);
		
int arraynumber=scan.nextInt();

		int a[]=new int[arraynumber];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
					}
		System.out.println("Enter the postion of array to delete");
		int postion =scan.nextInt();

		
		a[postion-1]=0;
		
		for(int b:a)
		{
			System.out.println(b);
		}
				
	}

}
