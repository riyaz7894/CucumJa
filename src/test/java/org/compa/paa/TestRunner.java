package org.compa.paa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeautureLOgi\\Search.feature",monochrome=true,dryRun=true,plugin ="html:target/Cucumer.html",tags="Smoke")
public class TestRunner {

}
