package com.test.BDD.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/bpat12/eclipse-workspace/CucumberBDD/src/main/java/com/test/BBD/Feature/login.feature"
		,glue= {"/Users/bpat12/eclipse-workspace/CucumberBDD/src/main/java/com/test/BBD/stepdefination/LoginSteps.java"}
)
public class TestRunner {

}
