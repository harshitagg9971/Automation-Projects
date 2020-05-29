package com.scripts.MavenActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTestIRCTC;
import com.pages.MavenActiTIME.POMIRCTCRegistration;

public class TestIRCTCRegistration extends BaseTestIRCTC
{
	@Test
	public void register() throws IOException
	{
		POMIRCTCRegistration task1 = new POMIRCTCRegistration(driver);
		task1.enterDetails();
	}
}
