package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_601_RegisterSteps extends GWD{

    Elements el = new Elements();
    int rnd = (int)(Math.random() * 10000);

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        logger.info("Test Başladı.");
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");}

    @When("The user fills in the registration form with valid data")
    public void theUserFillsInTheRegistrationFormWithValidData() {


        el.myClick(el.register);
        el.mySendKeys(el.firstName, "John");
        el.mySendKeys(el.lastName, "Wayne");
        el.mySendKeys(el.address, "123 lisa");
        el.mySendKeys(el.city, "los angeles");
        el.mySendKeys(el.state, "california");
        el.mySendKeys(el.zipCode, "12345");
        el.mySendKeys(el.phoneNumber, "1234567821");
        el.mySendKeys(el.ssn, "789158569");
        el.mySendKeys(el.userName, "john"+rnd);
        el.mySendKeys(el.password, "john12345");
        el.mySendKeys(el.confirmPassword, "john12345");


    }

    @And("Clicks the {string} button")
    public void clicksTheButton(String arg0) {

        el.myClick(el.RegisterDone);
    }

    @Then("The user should see a message confirming successful registration")
    public void theUserShouldSeeAMessageConfirmingSuccessfulRegistration() {

        el.wait.until(ExpectedConditions.textToBePresentInElement(el.headText, "Welcome john"));
        Assert.assertTrue(el.headText.getText().contains("Welcome"));

    }
}
