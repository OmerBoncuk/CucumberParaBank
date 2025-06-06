package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.text.Utilities;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC_607_RequestLoanSteps extends GWD {
    Elements elements = new Elements();

    @Given("The user clicks the Request Loan link on the ParaBank homepage")
    public void theUserClicksTheRequestLoanLinkOnTheParaBankHomepage() {
        elements.myClick(elements.requestLoanBTN);
    }

    @And("The user enters {string} into the {string} field")
    public void theUserEntersIntoTheLoanAmountField(String amount, String field) {
        elements.mySendKeys(getWebElement(field), amount);
    }

    @And("The user selects an account number from the dropdown in the From Account # field")
    public void theUserSelectsAnAccountNumberFromTheDropdownInTheFromAccountField() {
        elements.myClick(elements.fromAccountId);
    }

    @When("The user clicks the Apply Now button")
    public void theUserClicksTheApplyNowButton() {
        elements.myClick(elements.applyNowBTN);
    }

    @Then("The user verifies the following under the Loan Request Processed heading:")
    public void theUserVerifiesTheFollowingUnderTheLoanRequestProcessedHeading(DataTable control) {
        elements.wait.until(ExpectedConditions.visibilityOf(elements.loanProviderName));
        List<String> controlDatas = control.asList();

        Assert.assertTrue(elements.loanProviderName.getText().toLowerCase().contains(controlDatas.get(0).toLowerCase()), "Wrong Loan Provider Name");
        Assert.assertTrue(elements.loanStatus.getText().toLowerCase().contains(controlDatas.get(1).toLowerCase()), "Wrong Loan Status");
    }

    @And("The user verifies the message")
    public void theUserVerifiesTheMessage(DataTable control) {
        List<String> controlDatas = control.asList();

        if (controlDatas.get(0).toLowerCase().contains("approved")) {
            elements.wait.until(ExpectedConditions.visibilityOf(elements.loanRequestMSG));
            Assert.assertTrue(elements.loanRequestMSG.getText().toLowerCase().contains(controlDatas.get(0).toLowerCase()), "Loan Status Is Wrong");
        } else {
            elements.wait.until(ExpectedConditions.visibilityOf(elements.loanRequestMSGDenied));
            Assert.assertTrue(elements.loanRequestMSGDenied.getText().toLowerCase().contains(controlDatas.get(0).toLowerCase()), "Loan Status Is Wrong");
        }
    }

    @And("The user clicks the link for the newly created loan account number")
    public void theUserClicksTheLinkForTheNewlyCreatedLoanAccountNumber() {
        elements.myClick(elements.newAccountId);
    }

    @Then("The user verifies the following under the Account Details heading:")
    public void theUserVerifiesTheFollowingUnderTheAccountDetailsHeading(DataTable control) {
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.accountType, "LOAN"));
        List<String> controlDatas = control.asList();

        Assert.assertTrue(elements.accountType.getText().toLowerCase().contains(controlDatas.get(0).toLowerCase()), "Wrong Account Type");
        Assert.assertTrue(elements.balance.getText().toLowerCase().contains(controlDatas.get(1).toLowerCase()), "Wrong Balance");
        Assert.assertTrue(elements.availableBalance.getText().toLowerCase().contains(controlDatas.get(2).toLowerCase()), "Wrong Available Balance");
    }

    @And("The user verifies the message No Transactions Found under the Account Activity heading")
    public void theUserVerifiesTheMessageNoTransactionsFoundUnderTheAccountActivityHeading() {
        elements.wait.until(ExpectedConditions.textToBePresentInElement(elements.noTransactions, "No transactions found."));
        Assert.assertTrue(elements.noTransactions.getText().toLowerCase().contains("no transactions found."), "Transactions is not empty");
    }

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "Loan Amount":
                return elements.loanAmount;
            case "Down Payment":
                return elements.downPayment;
        }
        return null;
    }
}
