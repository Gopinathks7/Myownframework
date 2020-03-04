package org.java;

public class EXC10 
{

	
	public static void test(int i)
	{
		if(i<0)
		{
			System.out.println();
		}
		else
		{
			System.out.print(i+"     ");
			test(i-1);
		}
	}
	
	public static void getcharacter()
	{
		int count=0;
		String name="gopinath";
		char ch[]=name.toCharArray();
		for(char b:ch)
		{
			 count++;
		}
		System.out.println(count);
	}
	public static void max()
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max();
	}

}
