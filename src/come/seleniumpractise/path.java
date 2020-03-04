package come.seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

public class path implements ITestListener 
{

	public static void main(String[] args) throws InterruptedException {
	String key="webdriver.chrome.driver";
	String value="E:\\BrowserDrivers\\chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.ndtv.com");
	String win = driver.getWindowHandle();
	System.out.println(win);
	double latency=System.currentTimeMillis();
	System.out.println(latency);

	}
	}

