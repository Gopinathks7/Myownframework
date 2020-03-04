package org.java;

public class Excemple3 {

	public static void main(String[] args) {
String name="gopinath kumsi from bangalore"; int count=0;
char[]c=name.toCharArray();
for(char b:c)
{
	if(b==' ')
	{
		count++;
	}
}
System.out.println(count);
	}

}
