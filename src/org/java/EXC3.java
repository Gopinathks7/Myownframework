package org.java;

import java.util.ArrayList;
import java.util.List;

public class EXC3 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[]= {2,3,4};
	
	List<Integer>list=new ArrayList<Integer>();
	Boolean flag=true;
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
		    	list .add(b[j]);
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
