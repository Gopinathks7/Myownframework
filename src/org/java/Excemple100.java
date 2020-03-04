package org.java;

public class Excemple100 
{
	
	public static void getSecond()
	{
		int smallest =0;
		int secondSmallest =0;
		int a[]=	{2,3,5,7,9};
		  for (int i = 0; i < a.length; i++) 
		    {
		        if(a[i]==smallest)
		        {
		          secondSmallest=smallest;
		        } 
		        else if (a[i] < smallest) 
		        {
		            secondSmallest = smallest;
		            smallest = a[i];
		        } 
		        else if (a[i] < secondSmallest) 
		        {
		            secondSmallest = a[i];
		        }
	}
		  System.out.println(secondSmallest);
	}

	public static void main(String[] args) {
//	int a[]=	{ 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
//int largest=0;
//int secondlargest=0;
//
//
//for(int i=0;i<a.length;i++)
//{
//	  if(a[i]>largest)
//	  {
//		  secondlargest=largest;
//		  largest=a[i];
//	  }
//	  else if (a[i]>secondlargest)
//	  {
//		
//		secondlargest=a[i];
//	}
//
//	  }
//System.out.println(secondlargest);


		getSecond();

  
    }
  
	}

