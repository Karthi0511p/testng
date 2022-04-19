package org.ngdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class SecondClass extends BaseClass{
	
	 public SecondClass() {
			PageFactory.initElements(driver, this);
		 }
		@FindBy(id="location")
		  private WebElement location;  
		@FindBy(id="hotels")
		  private WebElement hotel; 
		  @FindBy(id="room_type")
		  private WebElement room;		  
		  @FindBy(id="room_nos")
		  private WebElement nos;
		  @FindBy(id="adult_room")
		  private WebElement adult;
		  @FindBy(id="child_room")
		  private WebElement child;
    	  @FindBy(id="Submit")
		  private WebElement src;	  
		  public WebElement getLocation() {
			return location;
		}
		public WebElement getHotel() {
			return hotel;
		}
		public WebElement getRoom() {
			return room;
		}

		public WebElement getNos() {
			return nos;
		}

		public WebElement getAdult() {
			return adult;
		}

		public WebElement getChild() {
			return child;
		}

		public WebElement getSrc() {
			return src;
}
}