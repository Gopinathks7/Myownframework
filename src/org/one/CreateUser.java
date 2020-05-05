package org.one;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateUser {

	public static void main(String[] args) 
	{
		WebDriver driver;
		try
		{
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key, value);
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/***************Creating the user***********************************/
		driver.get("https://wallethub.com/join/light");
		String email=".//input[@name='em']";
		String pass=".//input[@name='pw1']";
		String cnfpass=".//input[@name='pw2']";
		String btn=".//div[@class='btns']/button";
		String emailaddress="gopinathks9@gmail.com";
		String emailpassword="Someone@123#";
		String check=".//span[contains(text(),'Get my free credit score & report')]";
		String secondpass=".//input[@type='password']";
		
		String loginbutton=".//div[@class='btns dual']/button[2]";
		
		WebElement emailaddrress=driver.findElement(By.xpath(email));
		emailaddrress.sendKeys(emailaddress);
		
		WebElement password=driver.findElement(By.xpath(pass));
		password.sendKeys(emailpassword);
		
		WebElement cnfpassword=driver.findElement(By.xpath(cnfpass));
		cnfpassword.sendKeys(emailpassword);
		
		
		WebElement chekbox=driver.findElement(By.xpath(check));
		chekbox.click();
		
		WebElement subbmitbutton=driver.findElement(By.xpath(btn));
		subbmitbutton.click();
		
		driver.get("https://wallethub.com/join/login?redirect_to=https:%2F%2Fwallethub.com%2Fprofile%2Ftest-insurance-company-13732055i");
		String secondloginbutton=".//button[@type='button'][2]";
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(secondloginbutton)));
		String userlogin=".//input[@name='em']";
		String loginpassword=".//input[@type='password']";
		WebElement setusername=driver.findElement(By.xpath(userlogin));
		setusername.sendKeys(emailaddress);
		
		WebElement setpassword=driver.findElement(By.xpath(loginpassword));
		setpassword.sendKeys(emailpassword);
		
		WebElement clickLogin=driver.findElement(By.xpath(secondloginbutton));
		clickLogin.click();
		
		String star=".//*[@height='35.72']";
		String star4=".//*[@height='35.72'][4]";
		List<WebElement> allstar = driver.findElements(By.xpath(star));
		WebElement forthstart = driver.findElement(By.xpath(star4));
		int count=allstar.size();
		for(int i=0;i<count;i++)
		{
			WebElement el=allstar.get(i);
			Actions action= new Actions(driver);
			
			action.moveToElement(el).perform();
			Thread.sleep(1000);

		}
		forthstart.click();
		Thread.sleep(1000);
		String dropdown="//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div/ng-dropdown/div/span";
		String healthInsurance="//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div/ng-dropdown/div/ul/li[2]";
		String text=".//div[@class='android']/textarea";
		WebElement dropdownlist = driver.findElement(By.xpath(dropdown));
		dropdownlist.click();
		Thread.sleep(1000);
		 WebElement selecthealth = driver.findElement(By.xpath(healthInsurance));
		 selecthealth.click();
		 Thread.sleep(1000);
		 String testwords="This is for testing the application using selenium and java as combination using chromeDriver class most of the element ids are created using xpath";
		 WebElement entertext = driver.findElement(By.xpath(text));
		 entertext.sendKeys(testwords);
		 Thread.sleep(1000);
		 String submitbutton=".//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']";
WebElement clickingsubmitbutton = driver.findElement(By.xpath(submitbutton));
clickingsubmitbutton.click();

String confirmationtext=".//*[contains(text(),'Your review has been posted.')]";
WebElement sucessmsg=driver.findElement(By.xpath(confirmationtext));
Assert.assertTrue(sucessmsg.isDisplayed());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		 
		
}
	
}
