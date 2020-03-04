package org.java;

public class EXEC16 {

	public static void main(String[] args)
	{
		int number=54321;
		int temp=0;
		int rem=0;
		while(number>0)
		{
			temp=number%10;
			rem=rem*10+temp;
			number=number/10;
		}
		System.out.println(rem);
	}
}
