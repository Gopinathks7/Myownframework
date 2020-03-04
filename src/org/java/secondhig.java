package org.java;

public class secondhig {

	public static void main(String[] args) 
	{

int a[]= {3,6,9};
int high=a[0];
for(int i=0;i<a.length;i++)
{
	 if(a[i]>high)
	 {
		 high=a[i];
	 }
}
System.out.println(high);
int small=a[0];
for(int i=0;i<a.length;i++)
{
	 if(a[i]<high && a[i]>small)
{
	small=a[i];
}
}
System.out.println(small);
	}

}
