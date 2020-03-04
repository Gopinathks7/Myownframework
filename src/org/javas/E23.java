package org.javas;

public class E23 {

	public static void main(String[] args) 
	{
		 
		  int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		  boolean duplicate=false;
		  for(int i=0;i<arr.length;i++)
		  {
			   for(int j=i+1;j<arr.length;j++)
			   {
				    if(arr[i]==arr[j])
				    {
				    	 duplicate=true;
				    	 arr[j]=' ';
				    }
			   }
			   if(duplicate)
			   {
				   System.out.print(arr[i]);
				   duplicate=true;
			   }
		  }
	}
	
	}



