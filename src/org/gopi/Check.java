package org.gopi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Check {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("E:\\Demohtml\\months.html");
		WebElement el = driver.findElement(By.id("month"));
		Select select= new Select(el);
		List<WebElement> months = select.getOptions();
		List<String>lst=new ArrayList<String>();
		int count=months.size();
		for(int i=0;i<count;i++)
		{
			 WebElement elements=months.get(i);
			 String text=elements.getText();
			 lst.add(text);
		}
Collections.sort(lst);

for(String test:lst)
{
	System.out.println(test);
}
	}

}
