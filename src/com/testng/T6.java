package com.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T6 
{
	@DataProvider
	public Object[][] getdata()
	{
		Object [][] data=new Object[2][2];
		data[0][0]="Gopinath";
	data[0][1]="Kumsi";
	data[1][0]="Bangalore";
			data[1][1]="Kumsi to Bangaire";
		return data;
		
		
	}
	@Test(dataProvider ="getdata")
	public void putData(String s1,String s2)
	{
		Reporter.log(s1,true);
		Reporter.log(s2,true);
	
	
	}
}
