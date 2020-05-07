package org.one;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

public class Practise 
{
	ExtentReports eReports;
@BeforeClass
public void test()
{
	Reporter.log("This is Before Class",true);
}

@AfterClass
public void  test1()
{
	Reporter.log("This is After Class",true);
	
}
@Test
public void test3()
{
	Reporter.log("This is Test1 Class",true);
}
@Test(alwaysRun = false)
public void test4()
{
	Reporter.log("This is Test4 Class",true);
}

@BeforeMethod
public void test5(Method method)

{
	Reporter.log("This is Before Method",true);
}
@AfterMethod
public void test6()
{
	Reporter.log("This is AfterMethod",true);
}
}
