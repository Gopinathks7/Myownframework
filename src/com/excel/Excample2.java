package com.excel;

import org.testng.annotations.Test;

public class Excample2 
{
@Test
public void some()
{
	int rem=0;int last=0;int flag=0;int number=0;
	for(int i=10;i<200;i++)
	{
		 number=i;
		 rem=number%10;
		 while(number>0)
		 {
			 last=number%10;
			 number=number/10;
			 if(!(rem==last))
			 {
				 flag=0;
				 break;
			 }
			 flag++;
		 }
		 if(flag>0)
		 {
			 System.out.println(i);
		 }
	}
}
}
