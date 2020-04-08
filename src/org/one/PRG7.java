package org.one;

public class PRG7 
{
public static void test(int i)
{
	if(i<1)
	{
		System.out.println();

			}

	else
	{

		test(i-1);
		System.out.print(i+"   ");
	}
}
	public static void main(String[] args) {
	test(10);

	}

}
