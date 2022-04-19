package org.screenshort;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A extends BaseClass{
	public A() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}
	@FindBy(id="pass")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
}
