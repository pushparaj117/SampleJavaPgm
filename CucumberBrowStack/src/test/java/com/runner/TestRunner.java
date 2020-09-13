package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdef.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {
		"com.stepdef" }, dryRun = false, monochrome = true, plugin = {
				"pretty" }, snippets = SnippetType.CAMELCASE, strict = true)

public class TestRunner extends BaseClass {
	@AfterClass
	public static void AfterClass() {
		
	}

}
