package com.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args)
	{
		int sum=0;
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("E:\\Demohtml\\Tables.html");
		String xpath=".//table[@name='BookTable']/tbody/tr";
List<WebElement> head = driver.findElements(By.xpath(xpath));
int count=head.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	WebElement el= head.get(i);
	String name=el.getText();
	System.out.println(name+"   ");
	
}

	}

}
