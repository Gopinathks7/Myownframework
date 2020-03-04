package org.gopi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) 
	{
String key="webdriver.chrome.driver";
String value="E:\\BrowserDrivers\\chromedriver.exe";
System.setProperty(key, value);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("E:/Demohtml/tabledynamic.html");
List<WebElement> t1 = driver.findElements(By.tagName("tr"));

int count=t1.size();
for(int i=0;i<count;i++)
{
	String xpath="//td["+i+"]";
	for(WebElement td1:driver.findElements(By.xpath(xpath)))
			{
		String text=td1.getText();
		System.out.println(text+"  \n ");
			}
}
	}

}
