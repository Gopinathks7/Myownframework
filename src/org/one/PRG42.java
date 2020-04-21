package org.one;


import java.util.regex.Pattern;

public class PRG42 {

	public static String getReverse(String str)
	{
		Pattern p = Pattern.compile("\\s");
		String [] name=p.split(str);
		String result="";
		for(int i=0;i<name.length;i++)
		{
			if(i==name.length-1)
			{
				result=name[i]+result;
			}
			else
			{
				result="    " +name[i]+result;
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		String name="gopinath from Bnagalore";
		System.out.print(getReverse(name));
	}

}
