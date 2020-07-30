package org.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	int lenght=scan.nextInt();
	int [] a= new int [lenght];

	for (int i = 0; i <a. length; i++) {
    	a[i] = scan.nextInt();
	}
	
	String result = "";
	
	for(int i=a.length-1;i>=0;i--)
	{
		result = result + a[i] + " ";
	}
	System.out.println(result);
	scan.close();
	}

}
