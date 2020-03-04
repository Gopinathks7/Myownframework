package org.java;

import java.util.Scanner;

public class EXEC15 {

	public static void main(String[] args) 
	{
		System.out.println("Enter some thing");
		Scanner scan= new Scanner(System.in);
		String number=scan.nextLine();
			scan.close();
		char c[]=number.toCharArray();
		for(char b:c)
		{
			if(Character.isDigit(b))
			{
				System.out.println("Enter is number");
			}
			else
			{
				System.out.println("Enter is other");
			}
		}

	}

}
