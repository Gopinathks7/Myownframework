package com.wed;

public class EXC3 
{
	public static int getMissedNumber(int arr[])
	{
		 int number=arr.length+1;
		 int sum=number*(number+1)/2;
		 int totalsum=0;
		 int total=0;
		 for(int i=0;i<arr.length;i++)
		 {
			  totalsum+=arr[i];
			  
		 }
		 total=sum-totalsum;
		 return total;
	}

	public static void main(String[] args) 
	{
		int a[]= {1,3,4};
		System.out.println(getMissedNumber(a));
		
				

	}

}
