package org.java;

import java.util.Scanner;

public class StringORNUmber {

	public static void main(String[] args)
	{
	System.out.println("Enter something");
	Scanner scan=new Scanner (System.in);
	String name=scan.next();
	scan.close();
	String names="";
	String numbers="";
			String other="";
	char ch[]=name.toCharArray();
	for(char b:ch)
	{
		if(Character.isDigit(b))
		{
			numbers=numbers+b;
		} else if(Character.isLetter(b))
		{
			names=names+b;
		}
		else
		{
			other=other+b;
		}
	}
	System.out.println("Enter is Character  "+names);
	System.out.println("Enter is Number  "+numbers);
	System.out.println("Enter is Other  "+other);
	}
	

}
