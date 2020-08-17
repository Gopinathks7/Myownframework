package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class T8

{

	@Test(priority = 1)
	public void Six()
	{
		Reporter.log("Six " ,true);
	}
	
	@Test(priority = 2)
	public void Seveen()
	{
		Reporter.log("Seveen " ,true);
	}
	
	@Test(priority = 3)
	public void Eight()
	{
		Reporter.log("Eight " ,true);
	}
	
	@Test(priority = 4)
	public void Nine()
	{
		Reporter.log("Nine " ,true);
	}
	
	@Test(priority = 5)
	public void Ten()
	{
		Reporter.log("Ten " ,true);
	}
	
	
}
