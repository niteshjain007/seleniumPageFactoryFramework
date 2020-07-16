package com.talentica.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.talentica.testbase.TestBase;

public class IntroductionPage extends TestBase {
	
	//Page factory
	@FindBy(linkText="Page 4")
	WebElement contactLink;
	
	@FindBy(linkText="Page 3")
	WebElement aboutpageLink;
	
	@FindBy(how= How.LINK_TEXT, using ="Page 2")
	WebElement portfoliopageLink;
	
	@FindBy(how= How.CSS , using="#menu a[href='#page1']")
	WebElement introducitonPageLink;
	
	
	//Initialization
	public IntroductionPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public ContactPage clickOnContactLink(){
		contactLink.click();
		return new ContactPage();
	}

	public AboutPage clickOnpage3About(){
		aboutpageLink.click();
		return new AboutPage();
	}
	
	public PortfolioPage clickOnpage2portfolio(){
		portfoliopageLink.click();
		return new PortfolioPage();
	}
}
