package org.java;

public class EXC12 {

	public static void main(String[] args) 
	{
		int count=0;
		String name="gopinath from bangalroe and kumsi and something";
		char ch[]=name.toCharArray();
		for(char c:ch)
		{
			if(c==' ')
			{
				count++;
			}
		}
System.out.println(count);
	}

}
