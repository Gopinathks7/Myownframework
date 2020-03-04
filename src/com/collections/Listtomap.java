package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listtomap 
{

	public static int getValue(HashMap<String,Integer> map,String key)
	{
	try
	{
	Integer v=map.get(key); 
	return v;
	}
catch(Exception e)
	{
	e.printStackTrace();
	return 0;
	}

	}
	public static void main(String[] args)
	{
		
		
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Demohtml/months.html");
		WebElement months = driver.findElement(By.id("month"));
		Select select=new Select(months);
		ArrayList<String> a=new ArrayList<String>();
		for(WebElement month:select.getOptions())
		{
		a.add(month.getText());

		}


		HashMap<String,Integer> h=new HashMap<String,Integer>();


		for(String text:a)
		{
		int i=getValue(h,text); 


		h.put(text, ++i); 
		}
		System.out.println(h);
}
}