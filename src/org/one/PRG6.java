package org.one;

public class PRG6 {

	public static void main(String[] args)
	{
		int sum=0;
		int count=0;
		String name="Bangalore 560010";
		char c[]=name.toCharArray();
		for(char b:c)
		{
			 if(b>='0'&&b<='9')
			 {
				 count++;
				// System.out.print(b+"  ");
				 int total=Integer.parseInt(String.valueOf(b));
						 sum=sum+total;
			 }
		}
System.out.println("Total is  "+sum+" the number of interger is  "+count);
	}

}
