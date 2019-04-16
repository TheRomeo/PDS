package com.puredrivingschoolautomation.cucumberTests.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by u.8005353-1 on 16/04/2019.
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/week1.feature",glue={"com.puredrivingschoolautomation.cucumberTests"})


public class week1TR {
}
