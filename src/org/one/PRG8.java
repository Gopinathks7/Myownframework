package org.one;

import java.util.Scanner;

public class PRG8 {

	public static void main(String[] args) 
	{
		System.out.println("Enter something");
		Scanner scan= new Scanner(System.in);
		String name=scan.next();
		char c[]=name.toCharArray();
		for(char b:c)
		{
			if(Character.isDigit(b))
			{
				System.out.println("Entered is Number");
			}
			else if (Character.isLetter(b)) 
			{
				System.out.println("Enter is letter");
			}
			else
			{
				System.out.println("Special");
			}
		}

	}

}
