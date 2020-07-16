package com.july;

public class PRG4 {

	public static void main(String[] args) 
	{
		int a[]= {3,4,5,6,10};
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
	 if(high>a[i]&&small<a[i])
	 {
		 small=a[i];
	 }
}
System.out.println(small);
	}

}
