package org.today;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PRG3 {

@Test(retryAnalyzer = org.today.PRG4.class)
public void one()
{
	Assert.assertEquals(true , true);
}



@Test
public void Two()
{
	Assert.assertEquals(true , true);
}
}
