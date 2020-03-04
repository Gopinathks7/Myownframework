package org.java;

public class Excemple9 {

	public static void main(String[] args) 
	{
		int f=0;
				int s=1;
		int num=0;
		System.out.print(f+" ");
		System.out.print(s+" ");
		for(int i=1;i<=7;i++)
		{
			num=f+s;
			System.out.print(num+" ");
			f=s;
			s=num;
		}
	}

}
