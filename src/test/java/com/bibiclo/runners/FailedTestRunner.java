package com.bibiclo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
        },
        features = "@target/rerun.txt",
        glue = "com/bibiclo/stepDefinitions"
)

public class FailedTestRunner {
}
