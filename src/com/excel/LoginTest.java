package com.excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest
{
	WebDriver driver;
@Test
public void  getLogin() throws InterruptedException
{
	String key="webdriver.chrome.driver";
	String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key,value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	driver.get("https://actitime.jmr.co.za/actitime/login.do");
	
	int rc=Excel.getRowValue("Sheet1","F://latests.xlsx");
	for(int i=1;i<=rc;i++)
	{
		
		LoginPage page=new LoginPage(driver);
		 String uanme=Excel.getCallValue("Sheet1","F://latests.xlsx",i,0);
		 
		String pa=Excel.getCallValue         ("Sheet1","F://latests.xlsx",i,1);
	
		 page.setUserName(uanme);
		
		 page.setPassword(pa);

		 page.clickSubmit();
		 page.getWrongMessage();
	
	}
}
}
