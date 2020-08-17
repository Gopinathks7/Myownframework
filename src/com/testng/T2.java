package com.testng;

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

public class T2 
{
@BeforeSuite
public void beforeSuite()
{
	Reporter.log("I am in Before Suite",true);
}
@BeforeTest
public void beforeTest()
{
	Reporter.log("I am in Before Test");
}


@BeforeClass
public void beforeClass()
{
	Reporter.log("I am in Before Class",true);
}


@BeforeMethod
public void beforeMethod()
{
	Reporter.log("I am in Before Method",true);
}


@Test
public void one()
{
	Reporter.log("I am in test method one",true);
}


@Test
public void two()
{
	Reporter.log("I am in test method Two",true);
}


@AfterMethod
public void afterMethod()
{
	Reporter.log("I am in After Method",true);
}

@AfterClass
public void afterClass()
{
	Reporter.log("I am in After Class",true);
}


@AfterTest
public void afterTest()
{
	Reporter.log("I am in After Test",true);
}

@AfterSuite
public void afterSuite()
{
	Reporter.log("I am in After Suite",true);
}

}