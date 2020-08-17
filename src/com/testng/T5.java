package com.testng;

import org.testng.annotations.Factory;

public class T5 
{
@Factory
public static Object[] testData()
{
	 Object[] object = new Object[2]; 
	 object[0]= new T4();
	 object[1]= new T2();

	return object;
}

}
