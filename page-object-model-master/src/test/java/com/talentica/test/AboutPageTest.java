package com.talentica.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.talentica.pages.AboutPage;
import com.talentica.pages.ContactPage;
import com.talentica.pages.IntroductionPage;
import com.talentica.testbase.TestBase;
import com.talentica.utility.Utility;

public class AboutPageTest extends TestBase{

	
	AboutPage aboutpageObj;
	IntroductionPage introductionPage;
	
	public AboutPageTest(){
		super();
		initialization();
	}
	
	@BeforeTest
	public void setUp(){
		
		aboutpageObj=new AboutPage();
		introductionPage =new IntroductionPage();
		aboutpageObj=introductionPage.clickOnpage3About();
		System.out.println("Executed");
					
	}
	
	@Test(priority=1)
	public void verifyAboutIscmoingOrnot() throws InterruptedException{
		Thread.sleep(10000);
		
		String aboutTextcheck= aboutpageObj.getTextofAboutHeader();
		System.out.println(aboutTextcheck);
	/*	String title= contactPage.getTitle();
		Utility.takeScreenshot("target\\screenshot\\contact.jpg", driver);*/
		assertEquals(aboutTextcheck, "About");
	}
	

}
