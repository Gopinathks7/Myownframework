package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class EXEC3 {

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		hm.put(1,2);
		hm.put(3,4);
		hm.put(5,6);

	//System.out.println(hm);
	Hashtable<Integer, Integer>ht=new Hashtable<Integer, Integer>();
	ht.putAll(hm);
//	System.out.println(ht.keySet());
	System.out.println(ht.values());
	}

}
