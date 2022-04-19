package org.win;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firstp extends Base{
	public Firstp() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	private WebElement signin;


	public WebElement getSignin() {
		return signin;
	}
	
	
	
}
