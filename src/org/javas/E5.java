package org.javas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5 
{
	public static void verifyInvalidLinks(String URL)
	{
		try
		{
		URL="https://www.google.com/";
		URL url= new URL(URL);
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println(url+"   "  +connection.getResponseMessage());
		}
		if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(url+"  " + connection.getResponseMessage()+"  " + HttpURLConnection.HTTP_NOT_FOUND );
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	}

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
		int cont=links.size();
		System.out.println(cont);
		for(WebElement lin:links)
		{
			String text=lin.getAttribute("href");
			System.out.println(text);
			verifyInvalidLinks(text);
		}

	}

}
