package com.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Testings {

	public static void main(String[] args)
	{
	Scanner scan= new Scanner(System.in);
	int len=scan.nextInt();
	int a[]=new int [len];
	for(int i=0;i<len;i++)
	{
		a[i]=scan.nextInt();
	}
for(int i=a.length-1;i>=0;i--)
{
	System.out.println(a[i]+"   ");
}
scan.close();
	}

}
