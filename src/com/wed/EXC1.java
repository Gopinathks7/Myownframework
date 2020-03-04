package com.wed;

public class EXC1 {

	public static void main(String[] args) 
	{
	String name="ggopppinath";
	char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		   int f=0;
		   char c=ch[i];
		   
		   for(int j=0;j<ch.length;j++)
		   {
			     if(c==ch[j])
			    	 f++;
		   }
		   if(i==0)
		   {
			   System.out.println("Character  "+c+" Repeating for  "+f+" Times ");
			   continue;
		   }
		   boolean flag=true;
		   for(int k=i-1;k>=0;k--)
		   {
			   if(c==ch[k])
			   {
				    flag=false;
			   }
		   }
		   if(flag==true)
		   {
			   System.out.println("Character  "+c+" Repeating for  "+f+" Times ");
		   }
	}

	}

}
