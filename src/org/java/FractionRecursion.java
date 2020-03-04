package org.java;

public class FractionRecursion 
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
			System.out.println(fact);
		}
		return fact;
	}
	public static void main(String[] args) {
test(3);

	}

}
