package com.talentica.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.talentica.pages.IntroductionPage;
import com.talentica.pages.PortfolioPage;
import com.talentica.testbase.TestBase;

import junit.framework.Assert;

public class PortfolioPageTest extends TestBase{

	
IntroductionPage introductionPageObj;
	PortfolioPage portforlioPageObj;
	public PortfolioPageTest(){
		super();
		initialization();
	}
	
	@BeforeTest
	public void setUp(){
		
		portforlioPageObj=new PortfolioPage();
//		portforlioPageObj.getDetailsContentAboutPage3();
		introductionPageObj =new IntroductionPage();
		portforlioPageObj=introductionPageObj.clickOnpage2portfolio();
		System.out.println("Executed");
					
	}
	
	@Test(priority=1)
	public void verifyHeaderofPortfolio() throws InterruptedException
	{
		Thread.sleep(15000);
		String actualHeader= portforlioPageObj.getTextofPortfolioHeader();
		System.out.println(actualHeader);
		 Assert.assertTrue(actualHeader.equalsIgnoreCase("portfolio"));
	
	}
	
	@Test(priority=2)
	public void verifyContentofPortfolio() throws InterruptedException
	{
		
		String actualcontent= portforlioPageObj.getDetailsContentportfolioPage2();
		System.out.println(actualcontent);
		 Assert.assertTrue(actualcontent.contains("Content Management System"));
	
	}
}
