package org.java;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excemple23
{
	public static int getValue(HashMap<String , Integer>map,String key)
	{
		try
		{
		Integer value=map.get(key);
		return value;
	}
		catch(Exception e)
		{
			return 0;
			
		}
	}
	
	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value=("E:\\BrowserDrivers\\chromedriver.exe");
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("E:/Demohtml/mtr.html");
	WebElement options=driver.findElement(By.id("mtr"));
	Select select= new Select(options);
	ArrayList<String>arralist=new ArrayList<String>();
	HashMap<String , Integer>map=new HashMap<String, Integer>();
	for(WebElement snacks:select.getOptions())
	{
		  arralist.add(snacks.getText());
	}
	for(String text:arralist)
	{
		int i=getValue(map, text);
		map.put(text, ++i);
	}
System.out.println(map);
	}

}
