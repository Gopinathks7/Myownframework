package org.one;

import java.util.regex.Pattern;

public class WordRevers {

	
	public static String getRevers(String str)
	{
		Pattern p= Pattern.compile("\\s");
		String temp[]=p.split(str);
		String result="";
	for(int i=0;i<temp.length;i++)
	{
		if(i==temp.length-1)
		{
			result=temp[i]+result;
		}
		else
		{
			result="    "+temp[i]+result;
		}
	}
	return result;
	}
	public static void main(String[] args)
	{
	
String name="gopinath from bangalore";
System.out.println(getRevers(name));
	}

}
