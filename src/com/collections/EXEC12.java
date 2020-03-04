package com.collections;

public class EXEC12
{
public static void fac()
{
	int f=0;
	int s=1;
	int num=0;
	System.out.print(f+"  ");
	System.out.print(s+"  ");
	for(int i=1;i<=10;i++)
	{
		 num=f+s;
		 System.out.print(num+"   ");
		 f=s;
		 s=num;
	}
	
	
}
public static void rev()
{
	String name="gopi";
	for(int i=name.length()-1;i>=0;i--)
	{
		System.out.print(name.charAt(i)+"    ");
	}
}
	public static void main(String[] args) 
	{ 
		rev();
		
		for(int i=1;i<=10;i++)
		{
			  for(int j=1;j<=i;j++)
			  {
				  //System.out.print(j+" ");
			  }
		//	  System.out.println();
		}
	}

}
