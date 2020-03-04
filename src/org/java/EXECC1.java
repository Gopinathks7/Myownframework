package org.java;

public class EXECC1 {
	
	
	public static void num()
	{
		int num=3;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static int test(int i)
	{
		int sum=1;
		if(i>=1)
		{
			sum=sum+test(i-1);
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(test(3));
	}

}
