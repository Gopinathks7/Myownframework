package com.july;

public class PRG5 
{
public static int high(int arr[])
{
	int number=arr.length+1;
	int sum=number*(number+1)/2;
	int restsum=0;
	int total=0;
	for(int i=0;i<arr.length;i++)
	{
		restsum+=arr[i];
		
	}
	total=sum-restsum;
	return total;
	
}
	public static void main(String[] args)
	{
		int a[]= {2,4,5};
		System.out.println(high(a));

	}

}
