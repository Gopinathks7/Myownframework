package org.gopi;

public class once
{

	public static void getOne()
	{
		int rem=0;
		int last=0;
		int f=0;
		for(int i=10;i<200;i++)
				{
			  int n=i;
			  rem=n%10;
			  while(n>0)
			  {
				  last=n%10;
				  n=n/10;
				  if(!(last==rem))			
				  {
					  f=0;
					  break;
					  }
				  f++;
				  }
			  if(f>0)
			  
				  System.out.println(i);
			  
				}
	}
	
	public static void one()
	{
		int rem=0;
		int  last=0;
		int f=0;
		for(int i=10;i<300;i++)
		{
			 int n=i;
			  rem=n%10;
			  while(n>0)
			  {
				  last=n%10;
				  n=n/10;
				  if(!((rem==last)))
				  {
					   f=0;
					   break;
				  }
				  f++;
			  }
			 if(f>0)
				 System.out.println(i);
			 
			  }
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one();
	}

}
