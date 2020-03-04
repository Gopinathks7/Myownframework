package org.gopi;

public class Repeatcharacter {

	public static void main(String[] args)
	{
		String name="goopinnatthh";
		char[]ch=name.toCharArray();
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
				    	System.out.println("for "+ c+" is repeating for "+ f+" times");
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
				    	if(flag)
				    	{
				    		System.out.println("for "+ c+" is repeating for "+ f+" times");
				    	}
				    
			 }
		}

	}

