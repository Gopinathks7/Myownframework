package org.javas;

import java.util.Scanner;

public    class PRG1 {

	public static void main(String[] args)
	{
	String prime="";
		System.out.println("Enter an number");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			  int counter=0;
			  for(int j=i;j>=1;j--)
			  {
				  if(i%j==0)
				  {
					  counter =counter+1;
				  }
			  }
			  
			  if(counter==2)
			  {
				  prime=prime+i+"  ";
		
				  }
			 
			  }
		 System.out.println(prime);
		 scan.close();
		}

	

}
