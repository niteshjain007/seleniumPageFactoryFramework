package com.talentica.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.talentica.pages.AboutPage;
import com.talentica.pages.ContactPage;
import com.talentica.pages.IntroductionPage;
import com.talentica.testbase.TestBase;
import com.talentica.utility.Utility;

public class ContactPageTest extends TestBase {
	
	ContactPage contactPage;
	IntroductionPage introductionPage;
	
	public ContactPageTest(){
		super();
		initialization();
	}
	
	@BeforeTest
	public void setUp(){
		
		contactPage=new ContactPage();
		introductionPage =new IntroductionPage();
		contactPage=introductionPage.clickOnContactLink();
		System.out.println("Executed");
					
	}
	
	@Test(priority=1)
	public void verifyTitle() throws InterruptedException{
		Thread.sleep(5000);
		String title= contactPage.getTitle();
		Utility.takeScreenshot("target\\screenshot\\contact.jpg", driver);
		assertEquals(title, "Contact");
	}
	
	@Test(priority=2)
	public void verifyButtonText() throws InterruptedException{
		Thread.sleep(5000);
		String buttonText= contactPage.getButtonText();
		assertEquals(buttonText, "Send");	
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	

}
