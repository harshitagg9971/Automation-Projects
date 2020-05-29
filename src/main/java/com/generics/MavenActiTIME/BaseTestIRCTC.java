package com.generics.MavenActiTIME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestIRCTC implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void  openBroswer() 
	{
		System.setProperty(chrome_key, chrome_value);
		driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(irctc_Url);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}
