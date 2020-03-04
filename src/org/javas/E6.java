package org.javas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class E6 {

	public static void verifyURLStatus(String URL)
	{
		int invalidcount=0;
		try
		{
		URL="https://www.google.com/";
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(URL);
		HttpResponse response=client.execute(request);
		if (response.getStatusLine().getStatusCode() != 200)
			invalidcount++;
	}
		catch(Exception r)
		{
			r.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	}
	public static void main(String[] args)
	{
		int invalidcount=0;
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement> lin=driver.findElements(By.tagName("a"));
		int count=lin.size();
		System.out.println(count);
		for(WebElement link:lin)
		{
			if(link!=null)
			{
			String url=link.getAttribute("href");
		  System.out.println(url);
		  if (url != null && !url.contains("javascript"))
		  {
			  verifyURLStatus(url);
		  }
		  else
		  {
			  invalidcount++;
		  }
			}
		}
	

	}

}
