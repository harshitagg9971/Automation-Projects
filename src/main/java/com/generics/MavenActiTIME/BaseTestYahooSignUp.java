package com.generics.MavenActiTIME;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestYahooSignUp implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(yahoo_Url);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
