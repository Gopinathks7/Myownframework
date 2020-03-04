package org.java;

public class Excemple2 
{
public static void firstStep()
{
	String name="REVERSE";
	for(int i=name.length()-1;i>=0;i--)
	{
		System.out.print(name.charAt(i));
	}
}
public static void secondStep()
{
	String name="REVERSE";
	char []c=name.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]+"  ");
	}
}
	public static void main(String[] args)
{
		secondStep();

	}

}
