package com.testng;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class T4 
{
@Test(groups = "Regression")
public void one()
{
	Reporter.log("Regression Testing One ",true);
	
}

@Test(groups = "Sanity",alwaysRun = true)
public void two()
{
	Reporter.log("Sanity Testing",true);
}

@Test(groups="Regression")
public void three()
{
	Reporter.log("Regression Testing Three",true);
}

@Test(groups = "Regression")
public void four()
{
	Reporter.log("Regression Testing Four",true);
}
}
