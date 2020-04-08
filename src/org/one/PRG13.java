package org.one;

public class PRG13 {

	public static void main(String[] args) 
	{
		String msg="Not Same";
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				msg=" Same";
			}
		}
		System.out.println(msg);

	}

}
