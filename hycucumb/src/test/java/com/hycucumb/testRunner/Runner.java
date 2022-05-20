package com.hycucumb.testRunner;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\workspace\\hycucumb\\features",
glue="com.hycucumb.stepDefinitions",monochrome=true,dryRun=false,plugin= {"pretty","html:test-output"})


public class Runner {

}
