package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class T7 
{

	@Test(priority = 1)
	public void one()
	{
		Reporter.log("One ",true);
	}
	@Test(priority = 2)
	public void two()
	{
		
		Reporter.log("Two ",true);
	}
	@Test(priority = 3)
	public void three()
	{
		Reporter.log("three ",true);
	}
	@Test(priority = 4)
	public void Four()
	{
		Reporter.log("Four ",true);
	}
	@Test(priority = 5)
	public void Five()
	{
		Reporter.log("Five ",true);
	}
	
}
