package com.talentica.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.talentica.testbase.TestBase;

public class ContactPage extends TestBase {
	
	//Page Factory /Object repository
	@FindBy(xpath="//*[@id='content']/b")
	WebElement title;
	
	@FindBy(xpath="//*[@id='content']/form/input[1]")
	WebElement firstName;
	
	@FindBy(css="input[type='button']")
	WebElement button;

	//Initialization
	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String  getTitle(){
		return title.getText();
	}
	
		
	public String  getButtonText(){
		return button.getAttribute("value");
	}

}
