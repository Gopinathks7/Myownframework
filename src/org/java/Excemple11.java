package org.java;

public class Excemple11 
{
public static int getMissingNumber(int arr[])
{
	int number=arr.length+1;
	int sum=number*(number+1)/2;
	int totalsum=0;
	int t=0;
	for(int i=0;i<arr.length;i++)
	{
		totalsum+=arr[i];
	}
	t=sum-totalsum;
	return t;
}
	public static void main(String[] args) 
	{
		
int a[]= {1,3,4};
System.out.println(getMissingNumber(a));
	}

}
