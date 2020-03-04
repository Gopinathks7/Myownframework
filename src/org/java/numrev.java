package org.java;

public class numrev {

	public static void main(String[] args)
	{
int number=321;

int temp=0;
int rev=0;
while(number>0)
{
	temp=number%10;
	rev=rev*10+temp;
	number=number/10;
}
System.out.println(rev);
	}

}
