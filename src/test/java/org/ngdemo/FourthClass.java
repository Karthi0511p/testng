package org.ngdemo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FourthClass extends BaseClass{
	public FourthClass() {
       PageFactory.initElements(driver, this);
	}
		@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnumb;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnumb() {
		return ccnumb;
	}
	@FindBy(id="cc_type")
	private WebElement cctype;

	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	@FindBy(id="book_now")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
}
