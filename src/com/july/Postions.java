package com.july;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Postions {

	public static void main(String[] args) {
		 String key="webdriver.chrome.driver";
		 String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Dimension d= new Dimension(200,200);
		//driver.manage().window().setSize(d);
		Point p= new Point(200,300);
		driver.manage().window().setPosition(p);
	}

}
