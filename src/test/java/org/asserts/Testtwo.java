package org.asserts;

import org.ngdemo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testtwo extends BaseClass{
	public Testtwo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//ion-col[@class='ion-padding-end opacityWeight md hydrated'])[1]")
	private WebElement op1;
	
	
	@FindBy(xpath="(//div[@class='ng-untouched ng-dirty ng-invalid'])[2]")
	private WebElement op2;
	
	@FindBy(xpath="(//div[@class='ng-untouched ng-dirty ng-invalid'])[3]")
	private WebElement op3;
	
	@FindBy(xpath="(//div[@class='ng-untouched ng-dirty ng-invalid'])[4]")
	private WebElement op4;
	
	@FindBy(xpath="(//div[@class='ng-untouched ng-dirty ng-invalid'])[5]")
	private WebElement op5;
	
	@FindBy(xpath="//ion-button[@type='submit']")
	private WebElement submit;
	
	public WebElement getOp1() {
		return op1;
	}
	public WebElement getOp2() {
		return op2;
	}
	public WebElement getOp3() {
		return op3;
	}
	public WebElement getOp4() {
		return op4;
	}
	public WebElement getOp5() {
		return op5;
	}
	public WebElement getSubmit() {
		return submit;
	}

	
}
