package org.java;

import java.util.Scanner;

public class EXECR {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		System.out.println("Enter the postion");
		Scanner scan= new Scanner(System.in);
		int postion=scan.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a[postion-1]=0;
		}
		for(int value:a)
		{
			System.out.println(value);
		}
	}

}
