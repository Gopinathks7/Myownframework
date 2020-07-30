package com.july;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xwpf.converter.FileURIResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take {

	public static void main(String[] args) throws IOException
	{
		String key="webdriver.chrome.driver";
		 String value="E:\\BrowserDrivers\\common\\chromedriver.exe";
		 System.setProperty(key,value);
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:///www.google.com");
		 WebElement google=driver.findElement(By.id("hplogo" ));
			Point p= google.getLocation();
			int w=google.getSize().getWidth();
			int h=google.getSize().getHeight();
			TakesScreenshot screen= (TakesScreenshot)driver;
			File src= screen.getScreenshotAs(OutputType.FILE);
			File path=new File("E:/google.png");
			BufferedImage  fullImg = ImageIO.read(src);	
			BufferedImage finalimage=fullImg.getSubimage(p.x,p.y,  w, h);
			ImageIO.write(finalimage, "png",src );
			FileUtils.copyFile(src, path);
	}

}
