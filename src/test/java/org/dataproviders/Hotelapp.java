package org.dataproviders;

import org.ngdemo.BaseClass;
import org.ngdemo.FirstClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hotelapp extends BaseClass{

	
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

	
	@Test(priority = 1,dataProvider="user",dataProviderClass=Datapro.class)
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

}
