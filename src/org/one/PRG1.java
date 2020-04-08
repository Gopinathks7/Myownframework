package org.one;

public class PRG1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before swaping  A is "+a);
		System.out.println("Before swaping  B is "+b);
		
		a=a+b; //30
		b=a-b;//10;
		a=a-b;//20
		
		System.out.println("After swaping A is "+a);
		System.out.println("After swaping  B is "+b);

	}

}
