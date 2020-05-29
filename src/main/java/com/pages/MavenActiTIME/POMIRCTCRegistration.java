package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.BasePage;
import com.generics.MavenActiTIME.ExcelLibrary;



public class POMIRCTCRegistration extends BasePage implements AutoConstant
{
	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	private WebElement covidPopupOKButton;
	
	@FindBy(xpath = "//a[contains(text(),'REGISTER')]")
	private WebElement registerButton;
	
	@FindBy(xpath = "//input[@id='userName']")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@id='usrPwd']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@id='cnfUsrPwd']")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//label[@class='ng-tns-c10-4 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")
	private WebElement sequrityQuestionDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'What is your pet name?')]")
	private WebElement petNameOption;
	
	@FindBy(xpath = "//input[@placeholder='Security Answer']")
	private WebElement sequrityAnswerTextField;
	
	@FindBy(xpath = "//label[@class='ng-tns-c10-5 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")
	private WebElement preferredLanguageDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'English')]")
	private WebElement englishOption;
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@id='middleName']")
	private WebElement middleNameTextField;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@id='M']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath = "//input[@class='ng-tns-c11-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")
	private WebElement dateTextField;
	
	@FindBy(xpath = "//label[@class='ng-tns-c10-7 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")
	private WebElement occupationDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'STUDENT')]")
	private WebElement studentOption;
	
	@FindBy(xpath = "//label[contains(text(),'Unmarried')]")
	private WebElement unmarriedRadioButton;
	
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	private WebElement countryDropDown;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-invalid ng-touched']")
	private WebElement nationalityDropDown;
	
	@FindBy(xpath = "//textarea[@id='resAddress1']")
	private WebElement addressTextField;
	
	@FindBy(xpath = "//textarea[@id='resAddress2']")
	private WebElement streetTextField;
	
	@FindBy(xpath = "//textarea[@id='resAddress3']")
	private WebElement areaTextField;
	
	@FindBy(xpath = "//input[@placeholder='Pin code']")
	private WebElement pincodeTextField;
	
	@FindBy(xpath = "//input[@id='resState']")
	private WebElement stateTextField;

	@FindBy(xpath = "//div[@class='col-md-4 col-sm-4 col-xs-12 inlineBlock ng-star-inserted']//select[@class='form-control ng-pristine ng-invalid ng-touched']")
	private WebElement cityDropDown;
	
	@FindBy(xpath = "//div[@class='col-md-3 col-sm-3 col-xs-12 inlineBlock ng-star-inserted']//select[@class='form-control ng-pristine ng-invalid ng-touched']")
	private WebElement postOfficeDropDown;
	
	@FindBy(xpath = "//input[@id='resPhone']")
	private WebElement phoneNumberTextField;
	
	public POMIRCTCRegistration(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails() throws IOException
	{
		covidPopupOKButton.click();
		registerButton.click();
		
		usernameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_IRCTC, sheetName_RegistrationPage, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_IRCTC, sheetName_RegistrationPage, 1, 1));
		confirmPasswordTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_IRCTC, sheetName_RegistrationPage, 1, 2));
		sequrityQuestionDropDown.click();
		petNameOption.click();
		
	}
}
