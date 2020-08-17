package com.testng;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class T11 
{
@Test
public  void getFails()
{
	Assert.assertEquals(false, true);
}
@Test
public  void getPass()
{
	Assert.assertEquals(true, true);
}

}
