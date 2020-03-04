package com.collections;

public class EXCE23 {

	public static void main(String[] args)
	{

		int a[]= {1,3,5,7,8,11};
		int hig=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>hig)
			{
				hig=a[i];
			}
		}
System.out.println(hig);
int small=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]<hig &&a[i]>small)
	{
		small=a[i];
	}
}
System.out.println(small);
	}

}
