package org.java;

public class removespace {

	public static void main(String[] args) 
	{
	String str="";
String name="gopinath kums";
char c[]=name.toCharArray();
for(char b:c)
{
	if(b!= ' ')
	{
		str=str+b;
	}
}
System.out.println(str);
	}

}
