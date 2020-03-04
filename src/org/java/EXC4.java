package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXC4 {

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
		List<String>list=new ArrayList<String>();
		List<WebElement>alloptions=select.getOptions();
		int count=alloptions.size();
		for(int i=0;i<count;i++)
		{
			 WebElement element=alloptions.get(i);
			 String text=element.getText();
			 list.add(text);
		}
String []name=new String[list.size()];
list.toArray(name);

for(int i=0;i<name.length;i++)
{
	String text1="";
	text1=name[i];
	for(int j=i+1;j<name.length;j++)
	{
		 String text2="";
		 text2=name[j];
		 if(text1.compareToIgnoreCase(text2)==0)
		 {
			 System.out.println(" Duplicate pressent is "+text2);
		 }
	}
}
	}

}
