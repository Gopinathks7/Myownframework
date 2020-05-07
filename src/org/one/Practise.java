package org.one;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Practise 
{
	ExtentReports eReports;
	ExtentTest eTest;
	@BeforeSuite
	public void initFramework()
	{
		eReports=new ExtentReports(".//test-output"+".html");
	}
	@AfterSuite
	public void getClose()
	{
		eReports.flush();
	}
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
	Reporter.log("This is test method 3",true);
}
@Test()
public void test4()
{
	Reporter.log("This is Test4 Class",true);
}

@BeforeMethod
public void test5(Method method)
{
	eTest=eReports.startTest(method.getName());
	Reporter.log("This is Before Method",true);
}
@AfterMethod
public void test6(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		eTest.log(LogStatus.FAIL,"Fails");
	}
	else
	{
		eTest.log(LogStatus.PASS,"Pass");
	}
	eReports.endTest(eTest);
}
@Test
public void test6()
{
	int actual=10;
	int expected=10;
	Assert.assertEquals(actual, expected);
}
}
