package com.excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage 
{
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath=".//input[@name='username']")
	private WebElement user;
	
	@FindBy (xpath=".//input[@name='pwd']")
	private WebElement password;
		
	@FindBy(xpath=".//input[@type='submit']")
	private WebElement sub;
	
	@FindBy(xpath=".//span[contains(text(),'Username or Password is invalid. Please try again.')]")
	private WebElement wrong;
	public void setUserName(String name)
	{
		user.clear();
		user.sendKeys(name);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		sub.click();
	}
	public void getWrongMessage()
	{
		Assert.assertTrue(wrong.isDisplayed());	
}

}
