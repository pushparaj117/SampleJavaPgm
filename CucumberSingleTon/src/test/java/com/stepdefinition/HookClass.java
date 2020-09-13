package com.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseAdactin {

	@Before(order=2,value="@Reg")
	public void beforeHook1() {
		System.out.println("beforeHook1");
	}
	@Before(order=1)
	public void beforeHook4() {
		System.out.println("beforeHook4");
	}
	@After(order=1,value="@Reg")
	public void afterHook1() {
		System.out.println("afterHook1");
	}
	@After(order=2)
	public void afterHook2() {
		System.out.println("afterHook2");
	}
	

	
	
	
	
	
	
	
	
	
	
	
//	@Before
//	public void beforeScenario() {
//		
//		launchApp();
//		urlPass("http://adactinhotelapp.com/");
//	}
//	
//	@After
//	public void afterScenario() {
//		
//
//	}
}

