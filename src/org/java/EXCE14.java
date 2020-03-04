package org.java;

import java.util.Arrays;

public class EXCE14 {

	public static void main(String[] args)
	{
		Boolean duplicate=false;
		String name="dell";
		char a[]=name.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
	                 for(int j=i+1;j<a.length;j++)
	                 {
	                	  if(a[i]==a[j])
	                	  {
	                		  duplicate=true;
	                		  a[j]=' ';
	                	  }
	                	  
	                 }
	                
	                 if(duplicate)
	         		{
	         			System.out.println(a[i]+"  ");
	         			duplicate=false;
	         		}

	}
		

}
}
