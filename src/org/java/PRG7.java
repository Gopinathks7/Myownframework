package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRG7 {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("file:///E:/Demohtml/months.html");
	 WebElement  months = driver.findElement(By.id("month"));
	 Select select= new Select(months);
	 List<String>list=new ArrayList<String>();
	  List<WebElement> allmonths = select.getOptions();
	  int count=allmonths.size();
	  for(int i=0;i<count;i++)
	  {
		   WebElement e= allmonths.get(i);
		   String text=e.getText();
		   list.add(text);
	  }
	 String []name=new String[list.size()];
	 list.toArray(name);
	 for(int i=0;i<name.length;i++)
	 {
		 String opt=name[i];
		 
		 for(int j=i+1;j<name.length;j++)
		 {
			 String opt1=name[j];
			 if(opt.compareToIgnoreCase(opt1)==0)
			 {
				 System.out.println("Duplicate are "+opt1+"  ");
			 }
		 }
	 }
	}

}
