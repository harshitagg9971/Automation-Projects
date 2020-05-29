package com.scripts.MavenActiTIME;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.MavenActiTIME.BaseTest;
import com.pages.MavenActiTIME.POMFramework;



public class TestFramework extends BaseTest
{
	@Test
	public void ashu() throws IOException
	{
		POMFramework f=new POMFramework(driver);
		f.enterdetails();
	}
}
