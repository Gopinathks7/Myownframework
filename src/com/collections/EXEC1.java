package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class EXEC1 {

	public static void main(String[] args) 
	{
		
		LinkedList<String >link= new LinkedList<String>();
		link		.add("Two");
		link.add("Three");
		link.add("fount");

	System.out.println(	link.peekLast());
	
		ArrayList<String>list=new ArrayList<String>();
		list.addAll(link);
		
		
		
	}

}
