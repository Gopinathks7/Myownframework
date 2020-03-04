package org.java;

import java.util.TreeMap;

public class EXCAMPLE23 {

	public static void main(String[] args) 
	{
	TreeMap<String , String>name=new TreeMap<String, String>();
	name.put("One", "two");
	name.put("", "three");
	System.out.println(name.keySet());
	System.out.println(name.values());

	}

}
