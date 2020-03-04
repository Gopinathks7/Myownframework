package org.gopi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class S1 {

	public static void main(String[] args) throws InterruptedException
	{
	String key="webdriver.chrome.driver";
	String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
List<WebElement>name= driver.findElements(By.tagName("iframe"));

	WebDriver names=driver.switchTo().frame(1);
WebElement number=name.get(1);
Thread.sleep(2000);
String na=number.getAttribute("title");
	
	}

}
