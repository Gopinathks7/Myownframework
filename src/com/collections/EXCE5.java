package com.collections;

public class EXCE5 {

	
	public static void mul()
	{
		int number1=10;
		int number2=20;
		int total=0;
		for(int i=1;i<=number2;i++)
		{
			 total=total+number1;
		}
		System.out.println(total);
	}
	
	public static void div()
	{
		int number=10;
		int div=2;
		int result=0;
		
		while((number-div)>=0)
		{
			result++;
			number=number-div;
		}
		System.out.println(result);
	}
	public static void mut()
	{
		String first="Gopi";
		String last=first.replace('G','g');
		System.out.println(first);
		System.out.println(last);
	}
	public static void main(String[] args)
	{
		mut();
	}

}
