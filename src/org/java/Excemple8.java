package org.java;

public class Excemple8 
{
public static int test(int i)
{
	int fact=i;
	if(i<1)
	{
		return 1;
	}
	else
	{
	fact= fact=fact*test(i-1);
	return fact;
	}
}
	public static void main(String[] args) 
	{
		System.out.println(test(3));

	}

}
