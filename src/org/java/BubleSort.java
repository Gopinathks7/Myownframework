package org.java;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) 
	{
int a[]= {34,9,23};
int temp=0;
for(int i=0;i<a.length-1;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(a));
	}

}
