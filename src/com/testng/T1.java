package com.testng;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class T1 
{
@Test (priority = 1)
public void skip() 
{
	String value="Skip this method";
	if(value.equalsIgnoreCase("Skip this method"))
	{
		throw new  SkipException("Not Ready for Testing");
	}
	else
	{
		Reporter.log("I am not skipper",true);
	}

	{
		Reporter.log("I am out ",true);
	}
	
		
	
}
@Test(priority =2)
public void something()
{
	Reporter.log("Gopinath",true);
}
}
