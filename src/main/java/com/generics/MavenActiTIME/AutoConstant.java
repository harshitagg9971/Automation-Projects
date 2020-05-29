package com.generics.MavenActiTIME;

public interface AutoConstant 
{
	
	String chrome_key="webdriver.chrome.driver";
	String chrome_value="./drivers/chromedriver.exe";
	String gecko_key="webdriver.gecko.driver";
	String gecko_value="./drivers/geckodriver.exe";
	String ie_key="webdriver.ie.driver";
	String ie_value="./drivers/IEDriverServer.exe";
	String url="G:/STUDY MATERIAL/SELENIUM/Classes/may25(Automation Framework)/SampleFramework.html";
	String excel_path="./testData/NCSA6_TestData.xlsx";
	String sheetname="AshuDetails";
	
	//facebook
	String excelpath_facebookSignup = "./testData/Facebook_SignUp_TestData.xlsx";
	String facebook_Url = "https://www.facebook.com";
	String sheetName_Facebook = "FacebookSignUp";
	
	//Yahoo
	String excelpath_YahooSignup = "./testData/Yahoo_SignUp_TestData.xlsx";
	String yahoo_Url = "https://login.yahoo.com/account/create?specId=yidReg";
	String sheetName_yahoo = "yahoo";

	//Actitime
	String excelpath_Actitime = "./testData/Actitime_TestData.xlsx";
	String actitime_Url = "https://demo.actitime.com/login.do";
	String sheetName_Login = "Login";
	String sheetName_CustomerName = "CreateCustomer";
	String sheetName_CreateWork = "CreateWork";
	String sheetName_CreateLeave = "CreateLeaveType";
	String sheetName_editWork = "editWork";
	String sheetName_editLeave = "editLeave";
	
	//IRCTC
	String irctc_Url = "https://www.irctc.co.in/nget/train-search";
	String excelpath_IRCTC = "./testData/IRCTC_TestData.xlsx";
	String sheetName_RegistrationPage = "RegistrationPage";
}
