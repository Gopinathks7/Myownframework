package com.collections;

import java.util.Scanner;

public class EXEC13 {

	public static void main(String[] args)
	{
System.out.println("Enter an number");
Scanner scan= new Scanner(System.in);
int number=scan.nextInt();
String prime="";
for(int i=1;i<=number;i++)
{
	  int count=0;
	  for(int j=i;j>=1;j--)
	  {
		   if(i%j==0)
		   {
			   count=count+1;
		   }
		   
	  }
	  if(count==2)
	  {
		  prime=prime+i+"   ";
	  }
}
System.out.println(prime);
	}

}
