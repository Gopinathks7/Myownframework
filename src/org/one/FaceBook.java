package org.one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class FaceBook
{
	

public static void main(String[] ar)
{
	try
	{
	String key="webdriver.chrome.driver";
	String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement user=driver.findElement(By.id("email"));
	final String username="username";
	user.sendKeys(username);
	WebElement pass=driver.findElement(By.id("pass"));
	final String password="password";
	pass.sendKeys(password);
	String submit=".//input[@type='submit']";
	WebElement button=driver.findElement(By.xpath(submit));
	button.click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Hello world");
	}
}
}
