package com.sampleMuvi.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
       features = {"src/test/java/com/sampleMuvi/feature/Sample.feature"},
       glue= {"classpath:com\\sampleMuvi\\stepdefinition"}
)

public class TestRunner {  


}