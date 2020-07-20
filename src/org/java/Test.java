
package org.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test 
{

	public static int getMissing(int arr[])
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restsum=0;
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			restsum+=arr[i];
			
		}
		t=sum-restsum;
		return  t;
	}
	

public static void main(String[] args) 
	{
	int a[]= {3,5,6};
	
	System.out.println(getMissing(a));
	}


}	
