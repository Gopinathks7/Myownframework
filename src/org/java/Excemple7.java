package org.java;

public class Excemple7 {

	public static void main(String[] args) {
String name="gopinath1969";
int sum=0;
char []c=name.toCharArray();
for(char b:c)
{
	if(b>='0'&&b<='9')
	{
	int total=Integer.parseInt(String.valueOf(b));
	sum=sum+total;
	}
}
System.out.println(sum);
	}

}
