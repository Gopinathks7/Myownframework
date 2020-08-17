package com.seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com");;
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
String xpath=".//div[@id='__cricketsubscribe']/div[2]/div[2]/a[1]";
WebElement subscription=driver.findElement(By.xpath(xpath));
subscription.click();
//String scroll=".//div[@id='content1']/div[1]/div/ul/li/div/a/img";
//WebElement element=driver.findElement(By.xpath(scroll));
//JavascriptExecutor exe=(JavascriptExecutor)driver;
//Thread.sleep(1000);
//exe.executeScript("arguments[0].scrollIntoView();", element);
//Thread.sleep(1000);
//element.click();
		String window="window.scrollBy('1000,1000')";
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		
		exe.executeScript(("window.scrollBy(1000,1000)"));
	}

}
