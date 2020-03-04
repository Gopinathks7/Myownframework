package com.practise;

import java.util.ArrayList;
import java.util.List;

public class Excample2 {

	public static void main(String[] args)
	{
		int a[] = { 1, 1, 2, 1, 3, 4, 1, 2, 5 };
	    int b[] = { 1, 2, 3, 1, 3, 2, 4, 5, 6, 7 };
		boolean flag=true;
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			  for(int j=0;j<b.length;j++)
			  {
				    if(a[i]==b[j])
				    {
				    	 flag=false;
				    }
			  
				    if(i==j&&!list.contains(b[j]))
				    {
				    	  list.add(b[j]);
				    	  
				    }
			  }
		
		if(flag==true)
		{
			list.add(a[i]);
		}

	}
System.out.println(list);
}
}