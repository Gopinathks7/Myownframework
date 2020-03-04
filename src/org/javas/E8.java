package org.javas;

public class E8 {

	public static void main(String[] args) 
	{
String name="goppinath";
		Boolean duplicate=false;
char ch[]=name.toCharArray();
for(int i=0;i<ch.length;i++)
{
	  for(int j=i+1;j<ch.length;j++)
	  {
		    if(ch[i]==ch[j])
		    {
		    	duplicate=true;
		    	ch[j]=' ';
		    }
	  }

if(duplicate)
{
	  System.out.print(ch[i]+"  ");
	  duplicate=true;
}
	}
	}
}
