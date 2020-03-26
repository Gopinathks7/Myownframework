package com.learn;

import java.util.Scanner;
import java.util.regex.Pattern;

public class L1 
{
	
public 	static String reverseWords(String str) 
    { 
  
         Pattern pattern = Pattern.compile("\\s"); 
        String[] temp = pattern.split(str); 
        String result = ""; 
  
     
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length-1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 

	public static void main(String[] args) 
	{
	System.out.println("Enter your name:");

	String name="gopinath from bangalore";
	
	
	System.out.println(reverseWords(name));
	

	}

}
