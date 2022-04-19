package org.asserts;

import java.util.Date;
import org.ngdemo.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testown extends BaseClass{
	
	public static WebElement driver;
	
	@BeforeClass
	private void beforeclass() {
		Launch("Chrome");
		lunchUrl("https://devnewsafetyportalapp.azureedge.net/#/dashboard");

	}
	@BeforeMethod
	private void beforemethods() {
	  Date d=new Date();
	  System.out.println(d);

	}
    @Test(invocationCount=10)
	private void test1() throws InterruptedException {
    	navigateRefresh();
    	lunchUrl("https://devnewsafetyportalapp.azureedge.net/#/dashboard");
    	Testone t=new Testone();
    	Thread.sleep(15000);
    	sendkeys(t.getEmail(), "kannan.active@gmail.com");
    	sendkeys(t.getPass(),"Welcome@12");
    	onclick(t.getClick());
    	System.out.println("login page time");
    	Date d=new Date();
  	  System.out.println(d);
    	
    	
    }
	
	
	
    
    @AfterMethod
    private void aftermethods() {
    	 Date d=new Date();
   	  System.out.println(d);

	}
    @AfterClass
    private void adterclass() {
		System.out.println("done");
	}
}
