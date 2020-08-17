package com.wed;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retest implements IRetryAnalyzer 
{
	int i=0;
	int retry=3;
public boolean retry(ITestResult result)
{
	if(i<retry)
	{
		i++;
		return true;
	}
	return false;
}
}
