package org.ngdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdClass extends BaseClass{

	public ThirdClass() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id="radiobutton_0")
	private WebElement click;
	
	@FindBy(id="continue")
	private WebElement click1;
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getClick1() {
		return click1;
	}
}
