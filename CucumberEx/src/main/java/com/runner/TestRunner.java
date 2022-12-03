package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/features/login.feature",
                 glue="com.stepdef",
                 plugin= {"html:target"},
                 monochrome=true
                 
)


public class TestRunner {
	

}
