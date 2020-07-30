package org.hackerrank;

import java.util.LinkedList;
import java.util.Scanner;

public class Day15 {

	public static void main(String[] args) 
	{
		
		String name="gopinath";
		char c[]=name.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(c[i]+"  ");
			}
		}
	}

}
