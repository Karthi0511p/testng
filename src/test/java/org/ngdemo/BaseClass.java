package org.ngdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public static WebDriver Launch(String browserName) {
	// 01
	switch (browserName) {

	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	}
	return driver;
}
// 02
public static void lunchUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

// 03
public static void implicitlyWait(long time) {

	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}

// 04
public static String getCurrenturl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;

}

// 05
public static String getTitle() {
	String title = driver.getTitle();
	return title;
}

// 06
public static void close() {
	driver.close();
}
// 07

public static String gettext(WebElement e) {
	String text = e.getText();
	return text;

}

// 08
public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
}

// 09
public static void onclick(WebElement e) {
	e.click();

}

// 10
public static void clear(WebElement e) {
	e.clear();

}

// 11
public static void moveToElement(WebElement s) {
	Actions a = new Actions(driver);
	a.moveToElement(s).perform();
}

// 12
public static void dragAndDrop(WebElement o, WebElement p) {
	Actions a = new Actions(driver);
	a.dragAndDrop(o, p).perform();
}

// 13
public static void selectByIntex(WebElement o, int index) {
	Select s = new Select(o);
	s.selectByIndex(index);
}

// 14
public static void selectByvalue(WebElement o, String value) {
	Select s = new Select(o);
	s.selectByValue(value);
}

// 15
public static void selectByvissblevalue(WebElement o, String value) {
	Select s = new Select(o);
	s.selectByVisibleText(value);

}

// 16
public static void dselectall(WebElement o, String value) {
	Select s = new Select(o);
	s.deselectAll();

}

// 17
public static void dselectall(WebElement o, int index) {
	Select s = new Select(o);
	s.deselectByIndex(index);
}

// 18
public static void deselectbyvalue(WebElement o, String value) {
	Select s = new Select(o);
	s.deselectByValue(value);
}

// 19
public static void deselectbyvissbletext(WebElement o, String value) {
	Select s = new Select(o);
	s.deselectByVisibleText(value);
}

// 20
public static void sendkeys(WebElement o, String k) {
	o.sendKeys(k);

}

// 21
public static WebElement findlocator(String o) {
	WebElement Element = driver.findElement(By.id(o));
	return Element;

}

//22
public static WebElement findlocators(String o) {
	WebElement Element = driver.findElement(By.name(o));
	return Element;

}

//23
public static WebElement findlocatorsd(String o) {
	WebElement Element = driver.findElement(By.xpath(o));
	return Element;

} // 24

public static void jsClick(WebElement o) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click", o);
}

// 25
public static void jsscrolldown(WebElement o) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", o);
}

// 26
public static void jsscrollup(WebElement o) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(flase)", o);
}

// 27
public static void jssetattribute(WebElement o, String value) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','text'", o);
}

// 28
public static void jsgetattribute(WebElement o, String value) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].getAttribute('value','text'", o);
}

// 29
public static void accept() {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

// 30
public static void dismiss() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}

// 31
public static void promaccept(String value) {
	Alert alert = driver.switchTo().alert();
	alert.sendKeys(value);
	alert.accept();
}

// 32
public static void navigationUrl(String url) {
	driver.navigate().to(url);
}

// 33
public static void navigateRefresh() {
	driver.navigate().refresh();
}

// 34
public static void navigationForward() {
	driver.navigate().forward();
}

// 35
public static void navigationback() {
	driver.navigate().back();
}

// 36
public static void contextClick(WebElement y) {
	Actions a = new Actions(driver);
	a.contextClick(y).perform();
}
// 37

public static void doubleClick(WebElement y, Actions a) {
	a.doubleClick().perform();


}
// 38
public static void windowhandling(int index) {
	Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
	li.addAll(windowHandles);
	driver.switchTo().window(li.get(index));
	}


	/*
	 * private void getexceldata(String FileName,String sheetname,int rowno,int
	 * cellno )throws IOException { File f=new
	 * File("C:\\Users\\karthikeyan\\eclipse-workspace\\Mavennew\\Book1.xlsx");
	 * 
	 * FileInputStream fi=new FileInputStream(f); Workbook w=new XSSFWorkbook(fi);
	 * Sheet s = w.getSheet(sheetname); Row r = s.getRow(rowno); Cell c =
	 * r.getCell(cellno); //cell type int cellType = c.getCellType();
	 * System.out.println(cellType);
	 * 
	 * if(cellType==1) { FileName = c.getStringCellValue();
	 * 
	 * } else { if(Date.isCellDateFormatted(c)) {
	 * 
	 * FileName = new SimpleDateFormat("dd-mm-yyyy").format(c.getDateCellValue());
	 * 
	 * 
	 * } else {
	 * 
	 * FileName = String.valueOf((long) c.getNumericCellValue());
	 * 
	 * }
	 * 
	 * } return; }
	 */



}
