package com.collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pat 
{
	
	public 	static String reverseWords(String str) 
    { 
		
		Pattern pa=Pattern.compile("\\s");
		String []name=pa.split(str);
		String result="";
		for(int i=0;i<name.length;i++)
		{
			if(i==name.length-1)
			{
				result=name[i]+result;
			}
			else
			{
				result="    "  +name[i]+result;
			}
			
		}
		return result;
				
    }

	public static void main(String[] args) 
	{

	

	String name="Gopinath from bangalore";
	System.out.println(reverseWords(name));
	}

}
