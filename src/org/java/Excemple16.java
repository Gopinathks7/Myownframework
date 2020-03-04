package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excemple16 {

	public static void main(String[] args) 
	{
	int a[]= {2,3,3,5,6,7,9};
	int b[]= {3,3,5,6,7,8};
	boolean flag= true;
List<Integer>list=new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
	  for(int j=0;j<b.length;j++)
	  {
		   if(a[i]==b[j])
		   {
			   flag=false;
		   }
		   if(i==j&& !list.contains(b[j]))
		   {
			   list.add(b[j]);
		   }
	  }
	  if(flag==true)
	  {
		  list.add(a[i]);
	  }
}
Collections.sort(list);
System.out.println(list);
	}

}
