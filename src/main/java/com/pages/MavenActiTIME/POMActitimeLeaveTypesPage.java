package com.pages.MavenActiTIME;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.MavenActiTIME.AutoConstant;
import com.generics.MavenActiTIME.ExcelLibrary;


public class POMActitimeLeaveTypesPage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath="//span[text()='Create Leave Type']")
	private WebElement createLeaveTypeButton;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leaveTypeNameTextField;
	
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement createLeaveTypeSubmitButton;
	
	//@FindBy(xpath="//span[contains(.,'Corona Pandemic')]/../../../../../..//td[contains(@class,'leaveTypeDeleteCell last active')]")
	@FindBy(xpath="(//tr[@class='leaveTypeListRow hover']//td[contains(@class,'leaveType')])[7]")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[contains(text(),'Corona Pandemic')]")
	private WebElement leaveName;
	
	@FindBy(xpath = "//input[@id='inputDiv']")
	private WebElement editLeaveNameTextField;
	
	@FindBy(xpath = "//div[@id='LeaveNamePopup']//div[@class='applyButton']")
	private WebElement rightTickButton;
	
	@FindBy(xpath = "//div[@id='LeaveNamePopup']//div[@class='cancelButton']")
	private WebElement crossTickButton;
	
	public POMActitimeLeaveTypesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createLeaveTypeMethod() throws IOException
	{
		createLeaveTypeButton.click();
		leaveTypeNameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_CreateLeave, 1, 0));
		createLeaveTypeSubmitButton.click();
	}
	
	public void deleteLeaveTypeMethod()
	{
		deleteButton.click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public void editLeaveNameMethod() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		leaveName.click();
		Thread.sleep(2000);
		editLeaveNameTextField.sendKeys(Keys.SPACE);
		editLeaveNameTextField.sendKeys(ExcelLibrary.getcellvalue(excelpath_Actitime, sheetName_editLeave, 1, 0));
		Thread.sleep(1000);
		rightTickButton.click();
	}
}
