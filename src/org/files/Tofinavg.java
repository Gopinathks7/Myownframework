package org.files;

public class Tofinavg {

	public static void main(String[] args)
	{
		int a[]= {2,3,4,5,6,7,8,9};
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		
		}
		System.out.println(avg);
	}

}
