package org.asserts;

import org.ngdemo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testone extends BaseClass{
	public Testone() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signInName")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement pass;
	
	
	@FindBy(id="next")
	private WebElement click;
	

	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getClick() {
		return click;
	}
}