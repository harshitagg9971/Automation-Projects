package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.ExcelLibrary;


public class POMActitimeLoginPage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_Login, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_Login, 1, 1));
		keepMeLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public void forgotPasswordMethod() 
	{
		forgotPasswordLink.click();
	}
	
	public void actiTimeIncMethod()
	{
		actiTimeIncLink.click();
	}
}
