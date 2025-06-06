package StepDefinitions;

import Pages.Elements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_605_TransferFundsSteps extends GWD {
    Elements e = new Elements();
    ParentPage pp = new ParentPage();

    @Given("Navigate to TransferFunds")
    public void navigateToTransferFunds(){
        pp.myClick(e.transferFunds);
    }

    @Then("Money transfer between Accounts")
    public void moneyTransfer(){
        pp.myClick(e.fromAccount);
        pp.myClick(e.toAccount);
        pp.mySendKeys(e.amount, "158");
        pp.myClick(e.transfer);
    }

    @And("Success message should be displayed")
    public void succesMessageShouldBeDisplayed() {
        String expectedText = "$158.00 has been transferred from account";
        pp.wait.until(ExpectedConditions.textToBePresentInElement(e.showResult,expectedText));
        Assert.assertTrue(e.showResult.getText().contains("$158.00 has been transferred from account"));
    }

    @And("Navigate to TransferFunds2")
    public void navigateToTransferFunds2(){
        pp.myClick(e.transferFunds);
    }

    @When("Money transfer between Accounts2")
    public void moneyTransfer2(){
        pp.myClick(e.fromAccount);
        pp.myClick(e.toAccount);
        pp.mySendKeys(e.amount, "5858");
        pp.myClick(e.transfer);
    }

    @Then("Navigate to Accounts Overview")
    public void navigateToAccountsOverview(){
        pp.myClick(e.accountsOverview);
    }

    @And("Accounts Overview")
    public void accountOverview(){
        pp.myClick(e.accountNumber);
        pp.myClick(e.fundTransferReceived);
        String copyText= e.transactionIDnumber.getText();
        pp.myClick(e.findTransactions);
        pp.mySendKeys(e.transactionID,copyText);
        pp.myClick(e.findTransaction);
        pp.myClick(e.findTransactions);
        pp.mySendKeys(e.amount,"5858");
        pp.myClick(e.findByAmount);
        pp.myClick(e.fundTransferReceived);
        Assert.assertTrue(e.idAmount.getText().contains("$5858,00"));
    }

}
