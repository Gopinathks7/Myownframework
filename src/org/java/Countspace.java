package org.java;

public class Countspace {

	public static void main(String[] args) 
	{
		int count=0;
	String name="gopinath kumsi from bangalore";
	char c[]=name.toCharArray();
	for(char b:c)
	{
		if(b!=' ')
		{
			count++;
		}
	}
System.out.println(count);
	}

}
