package org.win;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondp extends Base{
	public secondp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input_0")
	private WebElement femail;

	public WebElement getFemail() {
		return femail;
	}
	
	/*
	 * @FindBy(name="secondp") private WebElement email;
	 */
	
	
	
	
	
	
	
	
	
	
	
}
