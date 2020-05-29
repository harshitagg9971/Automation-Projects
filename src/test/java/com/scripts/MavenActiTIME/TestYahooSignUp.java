package com.scripts.MavenActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTestYahooSignUp;
import com.pages.MavenActiTIME.POMYahooSignUp;


public class TestYahooSignUp extends BaseTestYahooSignUp
{
	@Test
	public void signUp() throws IOException
	{
		POMYahooSignUp task1 =  new POMYahooSignUp(driver);
		task1.enterDetails();
	}
}
