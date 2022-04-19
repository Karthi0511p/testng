package org.asserts;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class B {
	 @Test
	 public void test1() {
	   System.out.println("testbss1");
	   System.out.println(Thread.currentThread().getId());
	   Assert.assertTrue(false);

	}
  @Test
  public void test2() {
	   System.out.println("testbss2");
	   System.out.println(Thread.currentThread().getId());

	}
 // @Ignore
  @Test
  public void test3() {
	  
	   System.out.println("testbss3");
	   System.out.println(Thread.currentThread().getId());

	}
}
