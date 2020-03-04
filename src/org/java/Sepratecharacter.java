package org.java;

public class Sepratecharacter {

	public static void main(String[] args)
	{
		String name="gopinath123#$%";
		String special="";
		String number="";
		String character="";
		char c[]=name.toCharArray();
		for(char b:c)
		{
			if(Character.isDigit(b))
				number=number+b;
		
		else if (Character.isLetter(b))
		character=character+b;
		else
			special=special+b;
			
			}
		System.out.println(special);
		System.out.println(number);
		System.out.println(character);

}
}