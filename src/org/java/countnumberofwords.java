package org.java;

public class countnumberofwords {

	public static void main(String[] args)
	{
	
	
		String n=""; int count=0;
	String name="gopinath kumsi bangalore";
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)==' ')
		{
			count++;
		}
	}
	System.out.println(count+1);
}
}