package com.collections;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args)
	{
	System.out.println("Enter an number:-");
	Scanner scan= new Scanner(System.in);
	int number=scan.nextInt();
	String prime="";
	for(int i=1;i<=number;i++)
	{
		int count=0;
		for(int num=i;num>=1;num--)
		{
			 if(i%num==0) {
				 count=count+1;
			 }
		}
		if(count==2)
		{
			prime=prime+i+"  ";
			
		}
	}
System.out.println(prime);
	}

}
