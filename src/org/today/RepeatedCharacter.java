package org.today;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatedCharacter {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ndtv.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
String browser = driver.getWindowHandle();
Set<String> brow = driver.getWindowHandles();
System.out.println(browser);
System.out.println(brow);

	}

}
