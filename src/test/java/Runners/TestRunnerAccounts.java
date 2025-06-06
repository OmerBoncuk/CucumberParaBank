package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Accounts",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class TestRunnerAccounts extends AbstractTestNGCucumberTests {
}
