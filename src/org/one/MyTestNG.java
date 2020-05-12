package org.one;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNG {

	
	@BeforeSuite
	public void getBeforeSuite()
	{
		Reporter.log("Before Suite",true);
	}
	@AfterSuite
	public void getAfterSuite()
	{
		Reporter.log("After Suite",true);
	}
	@BeforeTest
	public void geBeforeTest()
	{
		Reporter.log("Before Test",true);
	}
	@AfterTest
	public void geAfterTest()
	{
		Reporter.log("After Test",true);
	}
	@BeforeClass
	public void getBeforeClass()
	{
		Reporter.log("BeforeClass",true);
	}
	@AfterClass
	public void getAfterClass()
	{
		Reporter.log("After Class",true);
	}
	@BeforeMethod
	public void getBeforeMethod()
	{
		Reporter.log("Before Method",true);
	}
	@AfterMethod
	public void getAfterMethod()
	{
		Reporter.log("After Method",true);
		
	}
	@Test(priority = 1)
	public void getTestMethodOne()
	{
		Reporter.log("Test Method One",true);
	}
	@Test(priority = 4)
	public void getTestMethodFour()
	{
		Reporter.log("Test Method Four",true);
	}
	
	@Test(priority =2)
	public void getTestMethodTwo()
	{
		Reporter.log("Test Method Two",true);
	}
	
	@Test(priority = 3)
	public void getTestMethodThree()
	{
		Reporter.log("Test Method Three",true);
	}
}
