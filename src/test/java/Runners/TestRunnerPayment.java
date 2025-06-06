package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Payment",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class TestRunnerPayment extends AbstractTestNGCucumberTests {
}
