package com.collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Forsafari {

	public static void main(String[] args) 
	{
		WebDriver driver= new SafariDriver();
		driver.get("https://www.google.com");

	}

}
