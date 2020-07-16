package com.july;

public class PRG3 
{

	public static int test(int i)
	{
		int fact=i;
		if(i<=0)
		{
			return 1;
		}
		else
		{
			fact=fact*test(i-1);
		}
		return fact;
	}
	public static void main(String[] args) 
	{
	
System.out.println(test(3));
	}

}
