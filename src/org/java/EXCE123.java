package org.java;

public class EXCE123 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		String msg=" Same";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				msg="Not Same";
			}

	}
		System.out.println(msg);
	}
}
