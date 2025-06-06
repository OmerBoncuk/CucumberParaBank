package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class TC_602_LoginSteps extends GWD{
    Elements elements = new Elements();




    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(DataTable userPass) {

        List<List<String>> listUserpass = userPass.asLists();

        String username = listUserpass.get(0).get(0);
        String password = listUserpass.get(0).get(1);

        elements.username.sendKeys(username);
        elements.password2.sendKeys(password);
        elements.loginbutton.click();

    }


    @When("Enter invalid username and password and click login button")
    public void enterInvalidUsernameAndPasswordAndClickLoginButton(DataTable userPass) {
        List<List<String>> listUserpass = userPass.asLists();

        String username = listUserpass.get(0).get(0);
        String password = listUserpass.get(0).get(1);

        elements.username.sendKeys(username);
        elements.password2.sendKeys(password);
        elements.loginbutton.click();
    }

    @When("Enter username {string} and password {string} and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton(String username, String password) {
        elements.username.sendKeys(username);
        elements.password2.sendKeys(password);
        elements.loginbutton.click();

    }

    @Then("Login should be {string}")
    public void loginShouldBe(String status) {
        if (status.equalsIgnoreCase("successful")) {
            Assert.assertTrue(GWD.getDriver().getPageSource().contains("Accounts Overview"));
        } else {
            Assert.assertTrue(GWD.getDriver().getPageSource().contains("error"));
        }


    }
}