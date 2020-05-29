package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.ExcelLibrary;


public class POMActitimeCreateTypeOfNewWork implements AutoConstant
{
	@FindBy(id="name")
	private WebElement nameTextField;
	
	@FindBy(xpath="//input[contains(@value,'Create Type of Work')]")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRateTextField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement saveButton;
	
	public POMActitimeCreateTypeOfNewWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createWorkMethod() throws IOException
	{
		nameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_CreateWork, 1, 0));
		billingRateTextField.sendKeys("20");
		createTypeOfWorkButton.click();
	}
	
	public void editWorkNameMethod() throws IOException
	{
		nameTextField.sendKeys(Keys.CONTROL,"a");
		nameTextField.sendKeys(Keys.BACK_SPACE);
		nameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_editWork, 1, 0));
		saveButton.click();
	}
}
