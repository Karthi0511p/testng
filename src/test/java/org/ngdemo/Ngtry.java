package org.ngdemo;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ngtry extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass");
		Launch("Chrome");
		lunchUrl("http://adactinhotelapp.com/index.php");

	}

	@BeforeMethod
	private void beforemethods() {
		System.out.println("beforemethods");

	}

	@Parameters({ "username", "password" })
	@Test(priority = 1)
	private void test1(@Optional("karthikeyan0511") String user, String pass) {
		System.out.println("test1");
		SoftAssert a = new SoftAssert();
		lunchUrl("http://adactinhotelapp.com/index.php");
		String curl = getCurrenturl();
		boolean check = curl.contains("adactinhotelapp");
		a.assertTrue(check);
		System.out.println("url done");

		FirstClass f = new FirstClass();
		sendkeys(f.getUsername(), user);

		String users = getAttribute(f.getUsername());
		a.assertEquals(users, "karthikeyan0511");

		sendkeys(f.getPass(), pass);

		String pas = getAttribute(f.getPass());
		a.assertEquals(pas, "9750765850");

		onclick(f.getClick());
		a.assertAll();
	}

	@Test(priority = 2)
	private void test2() {
		System.out.println("test2");
		SoftAssert a = new SoftAssert();
		SecondClass df = new SecondClass();
		selectByIntex(df.getLocation(), 5);
		String loc = getAttribute(df.getLocation());
		a.assertEquals(loc, "London");
		selectByIntex(df.getHotel(), 1);
		String hot = getAttribute(df.getHotel());
		a.assertEquals(hot, "Hotel Creek");

		selectByIntex(df.getRoom(), 3);
		String room = getAttribute(df.getRoom());
		a.assertEquals(room, "Deluxe");

		selectByIntex(df.getNos(), 2);

		selectByIntex(df.getAdult(), 2);
		selectByIntex(df.getChild(), 1);

		onclick(df.getSrc());
		a.assertAll();
	}

	@Test(priority = 3)
	private void test3() {
		ThirdClass th = new ThirdClass();

		onclick(th.getClick());
		onclick(th.getClick1());
	}

	@Test(priority = 4)
	private void test4() {
		FourthClass fc = new FourthClass();
		sendkeys(fc.getFirstname(), "karthi");
		sendkeys(fc.getLastname(), "keyan");
		sendkeys(fc.getAddress(), "67/54 chennai 636450");
		sendkeys(fc.getCcnumb(), "7264893574682459");
		selectByIntex(fc.getCctype(), 1);
		selectByIntex(fc.getMonth(), 8);
		selectByIntex(fc.getYear(), 9);
		sendkeys(fc.getCvv(), "789");
		onclick(fc.getClick());
	}

	@AfterMethod
	private void aftermethods() {
		System.out.println("aftermethods");

	}

	@AfterClass
	private void afterclass() {
		System.out.println("afterclass");

	}

}
