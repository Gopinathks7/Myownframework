package org.one;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testting 
{
@BeforeMethod
public void getBeforeMethod()
{
	Reporter.log("Before Method",true);
}

@BeforeTest
public void getTestMethod()
{
	Reporter.log("Before Test",true);
}

@Test
public void test1()
{
	Reporter.log("Frist",true);
}

@Test
public void test2()
{
	Reporter.log("Second",true);
}
}
