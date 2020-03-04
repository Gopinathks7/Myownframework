package org.java;

public class EXEC13 {

	public static void main(String[] args) 
	{
int a[]= {2,3,5,8,9};
int high=a[0];
int small=a[0];
for(int i=0;i<a.length;i++)
{
	 if(a[i]>high)
			 {
		 high=a[i];
			 }
}
//System.out.println(high);

for(int i=0;i<a.length;i++)
{
	if(a[i]<high&&a[i]>small)
	{
		small=a[i];
		
	}
	}
System.out.println("Second Highest is  " +small);
	}
}
