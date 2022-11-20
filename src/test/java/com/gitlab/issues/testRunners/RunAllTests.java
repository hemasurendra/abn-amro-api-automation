package com.gitlab.issues.testRunners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = "com.gitlab.issues.stepDefinition",tags = "@Regression")
public class RunAllTests {
}
