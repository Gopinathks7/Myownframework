package org.one;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BlueColor {


	public static void main(String[] args) throws SQLException
	{
		Connection con;
		Statement smt=null;
		try
		{
	
			String url="jdbc:mysql://localhost:3306/amazon";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, "root"," Kumsi123");
		smt=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
		
		String key="webdriver.chrome.driver";
		String value="E:\\BrowserDrivers\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("samsung mobile phones 4g");
		String xpath=".//input[@type='submit']";
WebElement search=driver.findElement(By.xpath(xpath));
search.click();
String xpath1=".//span[contains(text(),'Black')]";
List<WebElement> bluecolormobiles = driver.findElements(By.xpath(xpath1));
String name="";
int count=bluecolormobiles.size();
System.out.println("Number of Black Mobile is    "+count);
for(int i=0;i<count;i++)
{
	WebElement el=bluecolormobiles.get(i);
	 name=el.getText();
	System.out.println(name+"   ");
	
	
}

smt.executeQuery("INSERT INTO search(result)VALUES (name)");
	}

}
