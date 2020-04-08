package com.collections;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Once 
{
	
	

	public static String reverse(String str)
	{
	
		Pattern p= Pattern.compile("\\s");
		String name[]=p.split(str);
		String result="";
		for(int i=0;i<name.length;i++)
		{
if(i==name.length-1)
{
	result=name[i]+result;
}
else
{
	result="   " +name[i]+result;
}
			
		}
		return result;
	}
	public static void main(String[] args) {
		String name="i am fool";
		System.out.println(reverse(name));
	}

}
