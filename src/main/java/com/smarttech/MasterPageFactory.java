package com.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	@FindBy(xpath=("//*[@class='login']"))
     WebElement singinbutton ;
    
	@FindBy(xpath=("//*[@id='email']"))
     WebElement email ;
    
	@FindBy(xpath=("//*[@name='passwd'] "))
     WebElement pass ;

	public WebElement getSinginbutton() {
		return singinbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
    
    

}
