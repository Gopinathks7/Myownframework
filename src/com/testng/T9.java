package com.testng;

import org.testng.annotations.Test;

public class T9 
{
@Test(expectedExceptions =ArithmeticException.class)
public void test()
{
	int a=10;
	if(a/0==1)
	{
		System.out.println("pass");
	}
}
}
