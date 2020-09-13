package org.annotestng;

import org.testng.annotations.Test;

public class TestngTask {
	@Test(groups= {"apple"}, priority = -3)
	public void test4() {
	System.out.println("test4");

	}
	@Test(groups= {"bananna"},priority = 2)
	public void test2() {
	System.out.println("test2");

	}
	@Test(groups= {"apple"}, priority = 0)
	public void test1() {
	System.out.println("test1");

	}
	@Test(groups= {"apple"}, priority = 2)
	public void test3() {
	System.out.println("test3");

	}
	@Test(groups= {"bananna"},priority = -1)
	public void test5() {
	System.out.println("test5");

	}

}
                