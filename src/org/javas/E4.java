package org.javas;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(WebElement link:links)
		{
			
					String text=link.getAttribute("href");
			System.out.println(text);
			verifyInvalidLinks(text);
		}
		

	}
	public static void verifyInvalidLinks(String URL)
	{
		try
		{
		URL="https://www.google.com/";
		URL r= new URL(URL);
		HttpsURLConnection connection=(HttpsURLConnection)r.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println(r+"  "+connection.getResponseMessage());
		}
		if(connection.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(r+" " +connection.getResponseCode()+"  " + connection.HTTP_NOT_FOUND);
		}
	}
catch(Exception e)
		{
	e.printStackTrace();
		}
}
	
}
