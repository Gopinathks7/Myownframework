package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.hpsf.Array;

public class EXEC1009 {

	public static void main(String[] args)
	{
	List<String>list= new ArrayList<String>();
	list.add("gopinath");
	list.add("kumsi");
	list.add("bangalore");
	list.add("new delhi");
	Set<String>set=new TreeSet<String>();
	set.addAll(list);
System.out.println(set);

	}

}
