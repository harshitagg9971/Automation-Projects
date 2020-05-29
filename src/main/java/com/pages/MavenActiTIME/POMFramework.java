package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary;


public class POMFramework extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstnameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastnameTextfield;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadiobutton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadiobutton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countrycodeDropDownList;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobilenoTextfield;
	
	@FindBy(xpath="//textarea")
	private WebElement addressTextarea;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	public POMFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterdetails() throws IOException
	{
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 0));
		lastnameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
		femaleRadiobutton.click();
		remembermeCheckbox.click();
		selectbyvisibletext(countrycodeDropDownList, "+852");
		mobilenoTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 5));
		addressTextarea.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 6));
		saveButton.click();
		System.out.println("it clicked on save button");
	}
}
