package org.hackerrank;



public class Day12 
{
	
	public static void main(String[] args) 
	{
		
int rem=0;
int last=0;
for(int i=10;i<=100;i++)
{
	 int flag=0;
	 int number=i;
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
		 System.out.print(i+"  ");
		 }
}
	}

}
