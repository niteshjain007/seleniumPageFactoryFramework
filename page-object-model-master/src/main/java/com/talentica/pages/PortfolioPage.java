package com.talentica.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.talentica.testbase.TestBase;

public class PortfolioPage extends TestBase {

	@FindBy(how=How.CSS, using= "#content>b")
	public WebElement portfolioHeader;
	
	@FindBy(how=How.CSS, using= "#content")
	public WebElement portfolioContent;
	

	public PortfolioPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTextofPortfolioHeader()
	{
		return portfolioHeader.getText();
	}
	
	public String getDetailsContentportfolioPage2()
	{
		return portfolioContent.getText();
		
	}
}
