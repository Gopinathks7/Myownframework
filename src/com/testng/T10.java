package com.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T10 
{
@BeforeClass
public void beforeClass()
{
	Reporter.log("Before Class",true);
}

@BeforeTest
public void beforeTest()
{
	Reporter.log("Before Test",true);
}
@BeforeMethod
public void beforeMethod()
{
	Reporter.log("Before Method",true);
}
@Test
public  void getTest()
{
	Reporter.log("Test Method",true);
}

@Test
public  void putTest()
{
	Reporter.log("Put Method",true);
}

@AfterTest
public void getAfterTest()
{
	Reporter.log("After Test",true);
}

@AfterClass
public void getAfterClass()
{
	Reporter.log("After Class",true);
}

@AfterMethod
public void getAfterMethod()
{
	Reporter.log("After Method",true);
}
}
