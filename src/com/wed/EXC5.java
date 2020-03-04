package com.wed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXC5 {
	public static int getlist(HashMap<String , Integer> has,String key)
	{
		try
		{
		Integer v=has.get(key);
		return v;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("E:\\Demohtml\\months.html");
	WebElement mont = driver.findElement(By.id("month"));
	Select select= new Select(mont);
	List<WebElement> allmont = select.getOptions();
	List<String>list=new ArrayList<String>();
	HashMap<String, Integer>hash=new HashMap<String, Integer>();
	int count=allmont.size();
	for(int i=0;i<count;i++)
	{
		 WebElement el=allmont.get(i);
		 String text=el.getText();
		 list.add(text);
	}
for(String text:list)
{
	int v=getlist(hash, text);
	hash.put(text, ++v);
}
System.out.println(hash);
	}

}
