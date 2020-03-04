package com.pattrens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSInput;

public class PRG5 
{
public static int getHas(HashMap<String , Integer>hash,String key)
{
	 try {
		 Integer i=hash.get(key);
		 return i;
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 return 0;
}
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("file:///E:/Demohtml/months.html");
	 WebElement  months = driver.findElement(By.id("month"));
	 Select select= new Select(months);
	 List<String>list=new ArrayList<String>();
	 HashMap<String , Integer>maps= new HashMap<String, Integer>();

	 
	 for(WebElement e: select.getOptions())
	 {
		  String Text=e.getText();
		  list.add(Text);
	 }
for(String text:list)
{
	 int i=getHas(maps, text);
	 maps.put(text, ++i);
}
System.out.println(maps);
	}

}
