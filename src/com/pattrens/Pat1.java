package com.pattrens;

public class Pat1 {

	
	public static void one()
	{
		int n=5;
		int count=1;
		int count2=1;
		for (int i = 0; i <n; i++)
		{
		for (int j = 0; j <=i; j++) 
		{
		if(i%2!=0)
		{
		System.out.print(count--+" ");
		count2++;
		}
		else
		{
		System.out.print(count2+++" ");
		count--;
		} 
		if(j<i)
		{
			System.out.print(" * ");
			}
			}
			count=count+(2*i)+n-2;
			System.out.println();
			}
			}
			
	public static void two()
	{
		for(int i=0;i<10;i++)
			
		{
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(" *  ");
			 }
			 System.out.println();
		}
	}
	public static void main(String[] args) 
	{

one();
	}

}
