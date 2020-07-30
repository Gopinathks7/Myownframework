package com.test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args)
	{
	System.out.println("Enter number to array to be create");
	Scanner scan= new Scanner(System.in);
	int arraylenght=scan.nextInt();
	int a[]=new int[arraylenght];
	for(int i=0;i<a.length;i++)
	{
		a[i]=scan.nextInt();
	}
int highest=a[0];
for(int i=0;i<a.length;i++)
{
	if(highest>a[i])
	{
		highest=a[i];
	}
}
System.out.println("The Lowest  number is "+highest);
	}

}
