package org.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {
	 @Test
	   public void test1() {
		   System.out.println("siva");
		   System.out.println(Thread.currentThread().getId());

		}
	   @Test
	   public void test2() {
		   System.out.println("karthi");
		   System.out.println(Thread.currentThread().getId());

		}
	   @Test
	   public void test3() {
		 //  Assert.assertEquals("",false);
		   System.out.println("prabhu");
		   System.out.println(Thread.currentThread().getId());

		}
}
