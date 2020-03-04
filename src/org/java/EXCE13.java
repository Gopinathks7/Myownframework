package org.java;

import java.util.Arrays;

public class EXCE13 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		int a[]= {2,3,3,4,5,6,6};
		for(int i=0;i<a.length-1;i++)
				{
			                 for(int j=i+1;j<a.length;j++)
			                 {
			                	  if(a[i]==a[j])
			                	  {
			                		  
			                		  a[j]=' ';
			                	  }
			                	  
			                 }
			                
				}
	System.out.println(Arrays.toString(a));

	}

}
