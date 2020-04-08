package org.one;

public class PRG16 {

	public static void main(String[] args) 
	{
	int f=0;
	int sum=1;
	System.out.print(f+" ");
	System.out.print(sum+"  ");
	int number=0;
	for(int i=1;i<=5;i++)
	{
		
	
			 number=f+sum;
			 System.out.print(number+"    ");
		 f=sum;
		 sum=number;
	}

	}

}
