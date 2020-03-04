package come.seleniumpractise;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks 
{


	public static void main(String[] args) throws InterruptedException
	{
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
		for(WebElement alink:lin)
		{
			try
			{
			String url=alink.getAttribute("href");
				System.out.println("The URL name is  :=>"+url);
				verifyLinkActive(url);
		}
			
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		

	}
	}

	public static void verifyLinkActive(String URL)
	{
		try {
			URL="https://www.google.com/";
			URL u= new URL(URL);
		HttpsURLConnection connection=(HttpsURLConnection)u.openConnection();
		connection.setConnectTimeout(4000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println(u+"   " + connection.getResponseMessage());
		}
		if(connection.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(u+"  " +connection.getResponseMessage()+"  " + HttpsURLConnection.HTTP_NOT_FOUND);;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
