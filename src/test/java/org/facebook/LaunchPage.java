package org.facebook;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchPage extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	private void brforeclass() {
		Launch("Chrome");
		lunchUrl("https://www.facebook.com/");

	}
	@BeforeMethod
	private void beforemethod() {
		Date d =new Date();
        System.out.println(d);
	}
	@Test
	private void test1() {
		SoftAssert a=new SoftAssert();
		lunchUrl("https://www.facebook.com/");
		String curl = getCurrenturl();
		boolean fb = curl.contains("facebook");
		a.assertTrue(fb);
		System.out.println("fb url done");
		
		LoginPage lg=new LoginPage();
		
    	sendkeys(lg.getUsername(),"karthi");
    	String log = getAttribute(lg.getUsername());
    	a.assertEquals(log, "sankar");
    	
    	sendkeys(lg.getPassword(),"4984");
    	onclick(lg.getLogin());
    	
         a.assertAll();
		
	}
	
	@Test
	private void test2() {
		
	}
	@AfterMethod
	private void aftermethod() {
		Date d =new Date();
        System.out.println(d);

	}
	
	@AfterClass
	private void afterclass() {
	

	}
	
	
	
	
	

}
