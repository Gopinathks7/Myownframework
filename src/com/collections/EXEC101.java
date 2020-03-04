package com.collections;

public class EXEC101 {

	public static void main(String[] args) 
	{
		String name="goopinnath";
		char c[]=name.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			  for(int j=i+1;j<c.length;j++)
			  {
				  if(c[i]==c[j])
				  {
					  System.out.print(c[j]+"   ");
				  }
			  }
		}
	}

}
