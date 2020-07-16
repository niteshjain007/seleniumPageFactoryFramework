package com.talentica.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.talentica.testbase.TestBase;

public class AboutPage extends TestBase{
	
	@FindBy(how=How.CSS, using= "#content>b")
	public WebElement aboutHeader;
	
	@FindBy(how=How.CSS, using= "#content")
	public WebElement aboutDetailContent;
	
	
	public AboutPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTextofAboutHeader()
	{
		return aboutHeader.getText();
	}
	
	public String getDetailsContentAboutPage3()
	{
		return aboutDetailContent.getText();
		
	}
}
