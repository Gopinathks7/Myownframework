package org.java;

import java.util.Scanner;

public class EXC11 {

	public static void main(String[] args)
	{
		int count=0;
		char c='i';
	String msg="not found";
	String name="giopinath";
	char ch[]=name.toCharArray();
	for(char b:ch)
	{
		if(c==b)
		{
			count++;
			msg="found";
		}
	}
System.out.println("Character t   "+msg+" Number of Times " +count);
	}

}
