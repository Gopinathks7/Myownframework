package com.excel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		String xpath2=".//button[@class='_2AkmmA _29YdH8']";
		WebElement button=driver.findElement(By.xpath(xpath2));
		button.click();
		
		WebElement red=driver.findElement(By.name("q"));
		red.sendKeys("redmi 8A");
		String xpath1=".//button[@type='submit']";
		WebElement search=driver.findElement(By.xpath(xpath1));
		search.click();
		String xpath3=".//div[contains(text(),'Redmi')]";
		List<WebElement>redmi=driver.findElements(By.tagName("a"));
		//int count=redmi.size();
		//System.out.println(count);
		String xred=".//a [contains(text(),'Red')]";
		List<WebElement> somename = driver.findElements(By.xpath(xred));
	
		int number=somename.size();
		System.out.println(number);
		for(int i=0;i<number;i++)
		{
			try
			{
				 WebElement e= somename.get(i);
				 String text=e.getText();
					 System.out.println(text);
			}
			
	catch(org.openqa.selenium.StaleElementReferenceException e)
			{
		e.printStackTrace();
		}
		
					
			finally {
				System.out.println("End");
			}
		}		
			
		
//		List<WebElement> allredmi = driver.findElements(By.xpath(xpath3));
//		int count=allredmi.size();
//		for(int i=0;i<count;i++)
//		{
//			 WebElement element=allredmi.get(i);
//			 String name=element.getAttribute("background-color");
//			 System.out.println(name);
//		}

	}

}
