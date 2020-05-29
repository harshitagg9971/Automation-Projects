package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary;



public class POMYahooSignUp extends BasePage implements AutoConstant 
{
	@FindBy(id = "usernamereg-firstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "usernamereg-lastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "usernamereg-yid")
	private WebElement emailTextField;
	
	@FindBy(id = "usernamereg-password")
	private WebElement passwordTextField;
	
	@FindBy(id = "usernamereg-phone")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "usernamereg-day")
	private WebElement dayTextField;
	
	@FindBy(id = "usernamereg-year")
	private WebElement yearTextField;
	
	@FindBy(id = "usernamereg-freeformGender")
	private WebElement genderTextField;
	
	@FindBy(name = "shortCountryCode")
	private WebElement countryCodeDropDown;
	
	@FindBy(id = "usernamereg-month")
	private WebElement birthMonthDropDown;
	
	@FindBy(id = "reg-submit-button")
	private WebElement continueButton;
	
	public POMYahooSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails() throws IOException
	{
		firstNameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 0));
		lastNameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 1));
		emailTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 2));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 3));
		phoneNumberTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 4));
		selectbyvisibletext(birthMonthDropDown, "November");
		dayTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 5));
		yearTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 6));
		genderTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_YahooSignup, sheetName_yahoo, 1, 7));
		continueButton.click();
		System.out.println("Yahoo signUp Completed");
	}
}
