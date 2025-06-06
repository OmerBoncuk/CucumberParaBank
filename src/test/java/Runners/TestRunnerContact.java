package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Contact",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class TestRunnerContact extends AbstractTestNGCucumberTests {
}
