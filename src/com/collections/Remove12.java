package com.collections;

import java.util.Scanner;

public class Remove12 {
	public static String test(String s,int p)
	{
		return s.substring(0,p)+s.substring(p+1);
	}

	public static void main(String[] args) 
	{
	
String name="gopinath";
System.out.println("Enter the loction of charater to remove");
Scanner scan= new Scanner(System.in);
int number=scan.nextInt();
System.out.println(test(name, number));
	}

}
