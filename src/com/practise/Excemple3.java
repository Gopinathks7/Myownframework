package com.practise;

public class Excemple3 
{
public static int getMissedNumber(int arr[])
{
	int number=arr.length+1;
	int sum=number*(number+1)/2;
	int totalsum=0;
	int t=0;
	for(int i=0;i<arr.length;i++)
	{
		totalsum+=arr[i];
		
	}
	t=totalsum-sum;
	return t;
}
	public static void main(String[] args)
	{
		int a[]= {2,4,5};
		System.out.println(getMissedNumber(a));

	}

}
