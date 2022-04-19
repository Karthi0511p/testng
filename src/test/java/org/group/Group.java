package org.group;

import org.testng.annotations.Test;

public class Group {
	
	@Test(groups="smoke")
	private void A1() {
		System.out.println("A1");

	}
	@Test(groups="sanity")
	private void A2() {
		System.out.println("A2");

	}
	@Test(groups="regression")
	private void A3() {
		System.out.println("A3");

	}
	@Test(groups="retest")
	private void A4() {
		System.out.println("A4");

	}
	@Test(groups="smoke")
	private void A5() {
		System.out.println("A5");

	}
	@Test(groups="sanity")
	private void A6() {
		System.out.println("A6");

	}
	@Test(groups="regression")
	private void A7() {
		System.out.println("A7");

	}

}
