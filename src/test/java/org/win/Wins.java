package org.win;


import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Wins extends Base{
	public static WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		Launch("Chrome");
		lunchUrl("https://www.wix.com/");
	}
	
	@BeforeMethod
	private void BeforeMethod() {
		Date d=new Date();
		System.out.println(d);

	}
	@Test
	private void test() {
		
		Firstp f=new Firstp();
		onclick(f.getSignin());
	
	}
	@Test
	private void test2() {
		secondp p=new secondp();
       sendkeys(p.getFemail(),"karthi0511");
       Date d=new Date();
       System.out.println(d);
	}
	
	
	
	@AfterClass
	private void aftermethods() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	private void afterclass() {
		

	}
	
	
	
	
	
	

}
