package com.collections;

import java.util.HashSet;

public class EXEC2 {

	public static void main(String[] args)
	{
		HashSet<String>set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("three");
		set.add("four");
		
		HashSet<String>set1=new HashSet<String>();
		set1.add("four");
		set1.add("One");
		set1.add("nine");
		set1.add("ten");
	set1.retainAll(set);
	System.out.println(set1);
	}

}
