package com.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;



public class T3
{
	@Test
	public void something()
	{
	
String key="webdriver.chrome.driver";
String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebElement data=driver.findElement(By.xpath(".//input[@name='q']"));
data.sendKeys("name");
String xpath=(".//span[contains(text(),'java')]");
List<WebElement> listoftext = driver.findElements(By.xpath(xpath));
int count=listoftext.size();
listoftext.get(count-1).click();
}

}