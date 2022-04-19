package org.ngdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstClass extends BaseClass{
	
	public FirstClass() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement click;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClick() {
		return click;
	}

}
