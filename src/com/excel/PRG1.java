package com.excel;

public class PRG1 {

	public static void main(String[] args)
	{
	int rem=0;
	int last=0;
	for(int i=10;i<100;i++)
	{
		int f=0;
		 int number=i;
		 rem=number%10;
		 while(number>0)
		 {
			 last=number%10;
			 number=number/10;
			 if(!(rem==last))
			 {
				 f=0;
				 break;
			 }
			 f++;
		 }
		 if(f>0)
		 {
			 System.out.print(i+"  ");
		 }
	}
	
	
	}

}
