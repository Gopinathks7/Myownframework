package org.java;

public class Excemple20
{
public static int getMissingNumber(int arr[])
{
	 int n=arr.length+1;
	 int sum=n*(n+1)/2;
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
		int a[]= {8,5,6};
		
		System.out.println(getMissingNumber(a));
	}

}
