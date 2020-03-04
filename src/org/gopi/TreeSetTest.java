package org.gopi;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetTest {

	public static void main(String[] args) {
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
		Set<String>ts=new TreeSet<String>();
		int count=months.size();
		 String text="";
		for(int i=0;i<count;i++)
		{
			 WebElement mon=months.get(i);
			  text=mon.getText();
			 ts.add(text);
			
		}

		System.out.println(ts);
}
}
