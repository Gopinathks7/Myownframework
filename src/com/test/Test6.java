package com.test;


//Print next character
public class Test6 {

	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer();
		String name="ACEG";
		char c[]=name.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char ch=c[i];
			sb=sb.append(++ch);
		}
System.out.print(sb+"  ");
	}

}
