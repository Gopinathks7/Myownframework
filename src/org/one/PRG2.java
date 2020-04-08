package org.one;

public class PRG2 {

	public static void main(String[] args) 
	{
		int count=0;
		String name="Steve Jobs";
char []c=name.toCharArray();
for(char b:c)
{
	if(b!=' ')
	{
		count++;
	}
}
System.out.println("The number of character pressent is  "+count+"   ");
	}

}
