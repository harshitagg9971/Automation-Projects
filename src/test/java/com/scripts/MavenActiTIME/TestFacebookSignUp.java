package com.scripts.MavenActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTestFacebookSignUp;
import com.pages.MavenActiTIME.POMFacebookSignup;


public class TestFacebookSignUp extends BaseTestFacebookSignUp
{
	@Test
	public void signUp() throws IOException
	{
		POMFacebookSignup task1 = new POMFacebookSignup(driver);
		task1.enterDetails();
	}
}
