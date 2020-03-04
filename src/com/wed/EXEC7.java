package com.wed;

import java.util.regex.Pattern;

public class EXEC7 {

	public static void main(String[] args) 
	{
		String name="gopianth from bangalore and mysoretimes";
		String pattren=".*mysore.*";
		Boolean content=Pattern.matches(pattren,name);
		System.out.println(content);

	}

}
