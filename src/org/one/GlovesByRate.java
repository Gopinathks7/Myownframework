package org.one;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlovesByRate {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("hand gloves for surgical use");
		String xpath=".//input[@type='submit']";
WebElement search=driver.findElement(By.xpath(xpath));
search.click();
String xpath1=".//span[@class='a-price-whole']";
List<WebElement> price = driver.findElements(By.xpath(xpath1));
String name="";
int  cost=0;
int count=price.size();
System.out.println("Price     "+count);
for(int i=0;i<count;i++)
{
	
	WebElement el= price.get(i);
	
	name=el.getText();
	try
	{
	  cost=Integer.parseInt(String.valueOf(name));
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	  
}
System.out.println(cost);
	
	


//	if(cost >=200 && cost<=500)
//	{
//		System.out.println("The number is gloves found is  "+cost);
//	}


	}
}
