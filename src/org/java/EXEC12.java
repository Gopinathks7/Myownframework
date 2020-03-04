package org.java;

public class EXEC12 {

	public static void main(String[] args) 
	{
		String name="ACE";
		StringBuffer bf= new StringBuffer();
		char c[]=name.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char ch=c[i];
			bf.append(++ch);
		}
System.out.print(bf);
	}

}
