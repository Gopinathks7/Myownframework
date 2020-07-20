package com.july;

import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRG6 
{



	 public  static void main(String [] ags) throws InterruptedException
	{
		 String key="webdriver.chrome.driver";
		 String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("E:/Demohtml/Tables.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  String xpath=".//tr/td[4]";
		  String text="";
		 
		  List<WebElement>price=driver.findElements(By.xpath(xpath));
		  int count=price.size();
		
		  for(int i=0;i<count;i++)
		  {
			  WebElement prc=price.get(i);
			  text=prc.getText();
			  int prs= Integer.parseInt(String .valueOf(text));
	//System.out.println(prs);
	if(prs>300&& prs<3000)
	{
		System.out.println(prs);
	}
		  }
		 
	
	}

}