package org.java;

public class Excemple5 {

	public static void main(String[] args) {
		String name="gopinath kumsi from bangalore";
int count=0;
char[]c=name.toCharArray();
for(char b:c)
{
	if(b!=' ')
	{
		count++;
		System.out.print(b+"\n");
}
}
System.out.println("The number of character pressent is "+count);
	}

}
