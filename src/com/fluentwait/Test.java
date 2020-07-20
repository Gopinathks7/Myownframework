package com.fluentwait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test {

	public static void main(String[] args) 
	{
		 String key="webdriver.chrome.driver";
		 String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:///www.ndtv.com");
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver)
		 .withTimeout(20,TimeUnit.SECONDS)
	.pollingEvery(20,TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h_search_menu")));
	}

}
