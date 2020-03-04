package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EXE1 {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		ArrayList<Integer>list=new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
	list.add(a[i]);
}
Collections.reverse(list);
System.out.println(list);
	}

}
