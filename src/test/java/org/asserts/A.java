package org.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	 @Test
	 public void test1() {
	   System.out.println("testass1");
	   //System.out.println(Thread.currentThread().getId());

	}
 @Test(retryAnalyzer=WithKnowFaild.class)
 public void test2() {
	   System.out.println("testass2");
	 //  System.out.println(Thread.currentThread().getId());
	   Assert.assertTrue(false);

	}
 @Test
 public void test3() {
	  // Assert.assertEquals("",false);
	   System.out.println("testass3");
	  // System.out.println(Thread.currentThread().getId());

	}
}
