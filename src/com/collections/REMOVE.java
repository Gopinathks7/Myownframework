package com.collections;

import java.util.Scanner;

public class REMOVE {
	
	public static String charRemoveAt(String str, int p)
	{ 
		 
		  return str.substring(0, p) + str.substring(p + 1);  
     }  
	public static void main(String[] args) {
		 String str = "India is my country";  
		 System.out.println("Enter the postion to remove");
		 Scanner scan= new Scanner(System.in);
		 int number=scan.nextInt();
         System.out.println(charRemoveAt(str, number));  
         scan.close();

	}

}
