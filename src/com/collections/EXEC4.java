package com.collections;

import java.util.Scanner;

public class EXEC4 {

	public static void main(String[] args) 
	{
	System.out.println("Enter the postion");
	Scanner scan=  new Scanner(System.in);
	int a[]= {1,2,3,4,5};
	int postion=scan.nextInt();
	for(int i=0;i<postion;i++)
	{
		 a[postion-1]=0;
		 
	}
for(int ps:a)
{
	System.out.println(ps);
}
	}

}
