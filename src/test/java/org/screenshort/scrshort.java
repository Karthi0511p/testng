package org.screenshort;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class scrshort  extends BaseClass{
	@BeforeClass
	private void beforeclass() {
		Launch("Chrome");
		lunchUrl("https://www.facebook.com/");
		

	}
    @BeforeClass
    private void beforemethods() {
    	Date s=new Date();
    	System.out.println(s);
		
	}
    @Test
    private void test() {
		
    	A a=new A();
    	sendkeys(a.getUser(),"karthi");
    	sendkeys(a.getPass(),"87545");
    	

	}
    @AfterClass
    private void aftermethods() {
    	Date s=new Date();
    	System.out.println(s);
	}
    @AfterClass
    private void afterclass() {
		
	}
}
