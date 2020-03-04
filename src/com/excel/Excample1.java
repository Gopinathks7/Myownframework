package com.excel;

import org.testng.annotations.Test;

public class Excample1
{

	@Test
	public void getNumber()
	{
		int last=0;
		int reminder=0;
		int flag=0;
		for(int i=10;i<=100;i++)
		{
			 int n=i;
			 reminder=n%10;
			 while(n>0)
			 {
				  last=n%10;
				  n=n/10;
				  if(!(reminder==last))
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