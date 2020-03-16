package com.excel;

public class PRG2 
{

	
	 public static int getMissedNumber(int arr[])
	 {
		 int number=arr.length+1;
		 int sum=number*(number+1)/2;
		 int total=0;
		 int las=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 total+=arr[i];
			 
		 }
		 las=sum-total;
		 return las;
	 }
	public static void main(String[] args) 
	{
		int a[]= {1,3,4};
	System.out.print(getMissedNumber(a));
		

	}

}
