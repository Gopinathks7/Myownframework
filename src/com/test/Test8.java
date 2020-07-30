package com.test;

//Sort number and words
public class Test8 {

	public static void main(String[] args)
	{
		String str="abcd123efgh456";
char[] c=str.toCharArray();
String letteris="";
String number="";
for(char b:c)
{
	if(Character.isDigit(b))
	{
		number=number+b;
		
	}
	else
	{
		letteris=letteris+b;
	}

}
System.out.println("The Number pressent is "+number);
System.out.println("The Letter  pressent is "+letteris);
	}

}
