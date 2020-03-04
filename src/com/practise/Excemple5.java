package com.practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excemple5 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("E:\\Demohtml\\months.html");
	WebElement mont = driver.findElement(By.id("month"));
	Select select=new Select(mont);
	List<WebElement> months = select.getOptions();
	List<String>lst= new ArrayList<String>();
	int count=months.size();
	for(int i=0;i<count;i++)
	{
		WebElement al= months.get(i);
		String name=al.getText();
		lst.add(name);

	}
	String[]allname=new String[lst.size()];
	lst.toArray(allname);
	

	for(int j=0;j<allname.length;j++)
	{
		String tem1=allname[j];
		{
			for(int k=j+1;k<allname.length;k++)
			{
				String temp2=allname[k];
				if(tem1.compareToIgnoreCase(temp2)==0)
				{
					System.out.print(temp2+"  ");
					
				}
			}
		}
		
	}
		}
		
	}