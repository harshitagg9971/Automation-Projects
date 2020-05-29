package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary;



public class POMFacebookSignup  extends BasePage implements AutoConstant
{
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement surnameTextField;
	
	@FindBy(name = "reg_email__")
	private WebElement phoneOrEmailTextField;
	
	@FindBy(name = "reg_passwd__")
	private WebElement passwordTextField;
	
	@FindBy(id = "day")
	private WebElement birthDayDropDown;
	
	@FindBy(id = "month")
	private WebElement birthMonthDropDown;
	
	@FindBy(id = "year")
	private WebElement birthYearDropDown;
	
	@FindBy(xpath ="//label[contains(text(),'Female')]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath ="//label[contains(text(),'Male')]")
	private WebElement maleRadioButton;

	@FindBy(xpath ="//label[contains(text(),'Custom')]")
	private WebElement customRadioButton;
	
	@FindBy(name ="websubmit")
	private WebElement signUpButton;
	
	
	public POMFacebookSignup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails() throws IOException
	{
		firstNameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_facebookSignup, sheetName_Facebook, 1, 0));
		surnameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_facebookSignup, sheetName_Facebook, 1, 1));
		phoneOrEmailTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_facebookSignup, sheetName_Facebook, 1, 2));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_facebookSignup, sheetName_Facebook, 1, 3));
		selectbyvisibletext(birthDayDropDown,"20");
		selectbyvisibletext(birthMonthDropDown, "Nov");
		selectbyvisibletext(birthYearDropDown, "1997");
		maleRadioButton.click();
		signUpButton.click();
		System.out.println("Facebook signUp Completed");
	}
}
