package com.collections;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testn 
{
@Test
public void a()
{
	Reporter.log("a",true);
}
@Test(priority = 2)
public void b()
{
	Reporter.log("b",true);
}

@Test(priority = 1)
public void c()
{
	Reporter.log("c",true);
}
}
