package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EXC109 
{
	
	public static void one()
	{
		String str[]= {"gopinath","kumsi","delhi"};
		List<String>list=new ArrayList<String>(Arrays.asList(str));
		System.out.println(list);
	}
	
	
	public static void sortingTest()
	{
		String str[]={"Google","Facebook","Tesla","Yahoo","Yahoo","Google","Facebooke","Tesla",  "eCommerce","mCommerce"};
Set<String>treeset=new TreeSet<String>(Arrays.asList(str));
Iterator<String>itr=treeset.iterator();
while(itr.hasNext())
{

System.out.println(itr.next());
}

	}

	public static void main(String[] args) 
	{
		sortingTest();

	}

}
