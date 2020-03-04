package com.collections;

public class CharacterOccu {

	public static void main(String[] args)
	{
		String name="bbangallore";
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			 int f=0;
			 char c=ch[i];
			 for(int j=0;j<ch.length;j++)
			 {
				  if(c==ch[i])
				  
					  f++;
				  
			 }
	if(f==0)
	{
		System.out.println("Character  " +c +  " Repeating "+f+" Number of times");
	}
	Boolean flag=true;
	for(int k=i;k>=0;k--)
	{
		if(c==ch[k])
		{
			flag=false;
		}
	
	}
	if(flag)
	{
		System.out.println("Character  " +c +  " Repeating "+f+" Number of times");
		
	}
		}

	}
	}

