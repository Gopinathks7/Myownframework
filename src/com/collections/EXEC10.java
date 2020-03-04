package com.collections;

public class EXEC10 {

	public static void main(String[] args) {

		String name="abc";
		StringBuilder b= new StringBuilder();
		char c[]=name.toCharArray();
		for(char a:c)
		{
			b.append((byte) a);
		}
		System.out.println("Builder Numabr is "+b);
		String number=(b.toString());
		int nu=Integer.parseInt(String.valueOf(number));
		System.out.println("The number is as follows   "
				+ ""+  nu);
		int fact=1;
	
		
		for(int i=1;i<=nu;i++)
		{
			fact=fact*i;
		}
		System.out.print ("Factorial number is "+  fact+"  ");
	}

}
