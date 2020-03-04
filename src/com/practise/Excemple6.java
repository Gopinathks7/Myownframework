package com.practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excemple6 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("E:\\Demohtml\\months.html");
	WebElement mont = driver.findElement(By.id("month"));
	List<String>alist=new ArrayList<String>();
	Select select= new Select(mont);
	List<WebElement> allmonths = select.getOptions();
	int count=allmonths.size();
	for(int i=0;i<count;i++)
	{
		 WebElement month=allmonths.get(i);
		 String text=month.getText();
		 alist.add(text);
	}
	
	String monthname[]=new String [alist.size()];
	alist.toArray(monthname);
	for(int i=0;i<monthname.length;i++)
	{
		String name1=monthname[i];
		
		for(int j=i+1;j<monthname.length;j++)
		{
			 String name2=monthname[j];
			 if(name1.compareToIgnoreCase(name2)==0)
			 {
				 System.out.println("Duplicate Contents are "+name2+"    ");
			 }
		}
	}
	}

}
