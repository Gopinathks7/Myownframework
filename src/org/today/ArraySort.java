package org.today;

public class ArraySort 
{
	
	public static int  test(int i)
	{
		int f=i;
		if(i<1)
		{
			return 1;
		}
		else
		{
			f=f*test(i-1);
		}
		return f;
	}

	public static void main(String[] args)
	{
	
System.out.print(test(3));




	}
}