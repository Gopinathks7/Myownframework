package org.java;

import java.util.Arrays;

public class EXCE12 
{
	static int count=0;
public EXCE12()
{
	count++;
	
}
	public static void main(String[] args)
	{
		int a[]= {31,34,67,98,45};
		for(int i=0;i<a.length-1;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
							 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
			 
		}
		System.out.println(Arrays.toString(a));
		

	}

}
