package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_604_OpenNewAccount extends GWD{

    Elements elements=new Elements();
    int rnd = (int)(Math.random() * 1000);


    @When("Fill out the registration form with valid information")
    public void fillOutTheRegistrationFormWithValidInformation() {
        elements.myClick(elements.register);
        elements.mySendKeys(elements.firstName, "John");
        elements.mySendKeys(elements.lastName, "Wayne");
        elements.mySendKeys(elements.address, "123 lisa");
        elements.mySendKeys(elements.city, "los angeles");
        elements.mySendKeys(elements.state, "california");
        elements.mySendKeys(elements.zipCode, "12345");
        elements.mySendKeys(elements.phoneNumber, "1234567821");
        elements.mySendKeys(elements.ssn, "789158569");
        elements.mySendKeys(elements.userName, "john"+rnd);
        elements.mySendKeys(elements.password, "john12345");
        elements.mySendKeys(elements.confirmPassword, "john12345");
    }

    @And("Click the {string} button")
    public void clickTheButton(String arg0) {
        elements.myClick(elements.RegisterDone);
    }

    @Then("Check a message confirming successful registration")
    public void checkAMessageConfirmingSuccessfulRegistration() {
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.headText, "Welcome john"));
        Assert.assertTrue(elements.headText.getText().contains("Welcome"));
    }

    @Given("Click the Open New Account button")
    public void clickTheOpenNewAccountButton() {
        elements.myClick(elements.OpenNewAccount);
    }

    @When("Select checking account type")
    public void selectCheckingAccountType() {
        elements.myClick(elements.CheckingOpt);
    }

    @And("Select an existing account")
    public void selectAnExistingAccount() {
        elements.myClick(elements.AccountSelect);
    }

    @Then("Click the Open New Account")
    public void clickTheOpenNewAccount() {
        elements.myClick(elements.ConfirmOpenNewAccount);
    }

    @And("Check the message that Account Opened")
    public void checkTheMessageThatAccountOpened() {
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.CongMessage, "Account Opened!"));
        Assert.assertTrue(elements.CongMessage.getText().contains("Account Opened!"));
    }

    @When("Select saving account type")
    public void selectSavingAccountType() {
        elements.myClick(elements.SavingOpt);
    }
}
