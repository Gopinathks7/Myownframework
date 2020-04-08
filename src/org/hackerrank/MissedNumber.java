package org.hackerrank;

public class MissedNumber
{
public static int getMissedNumber(int arr[])
{
	int num=arr.length+1;
	int sum=num*(num+1)/2;
	int rem=0;
	int totalsum=0;
	for(int i=0;i<arr.length;i++)
	{
		totalsum+=arr[i];
		
	}
	rem=sum-totalsum;
	return rem;
	
	
}
	public static void main(String[] args) {
		int a[]= {1,3,4};
		System.out.println(getMissedNumber(a));

	}

}
