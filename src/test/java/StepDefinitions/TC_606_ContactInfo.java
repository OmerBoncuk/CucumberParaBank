package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_606_ContactInfo extends GWD {
    Elements el = new Elements();

    @And("User should update successfully" )
    public void userShouldUpdateSuccessfully() {
        el.wait.until(ExpectedConditions.visibilityOf(el.updateProfileText));
        Assert.assertTrue(el.updateProfileText.getText().contains("Updated"));
    }

}
