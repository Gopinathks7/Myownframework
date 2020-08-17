package com.seleniumtesting;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Test1 
{

	public static void main(String [] a) throws InterruptedException
	{
String key="webdriver.chrome.driver";
String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
System.setProperty(key, value);
ChromeOptions opt=new ChromeOptions();
opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
opt.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
WebDriver driver= new ChromeDriver(opt);
driver.get("https://www.google.com");
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
String xpath=".//div[@id='gws-output-pages-elements-homepage_additional_languages__als']/div/a[7]";
WebElement kannada=driver.findElement(By.xpath(xpath));
Actions action =new Actions(driver);
action.contextClick(kannada).perform();
String name="Open link in new window";
Thread.sleep(1000);
action.sendKeys("w").perform();
System.out.println("Done");

	
	}
	

	
	
}