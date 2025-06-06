package StepDefinitions;

import Pages.Elements;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class TC_603_BillPay extends GWD{
    Elements el = new Elements();

    @And("Click on the Element")
    public void clickOnTheElement(DataTable butonlar) {
        List<String> listbutonlar= butonlar.asList();

        for (int i = 0; i < listbutonlar.size(); i++) {
            el.myClick(  el.getOmerElement(listbutonlar.get(i))  );
        }
    }

    @And("User sending the keys in Box")
    public void userSendingTheKeysInBox(DataTable kutuVeYazi) {
        List<List<String>> listkutuVeYazi= kutuVeYazi.asLists();

        for (int i = 0; i < listkutuVeYazi.size(); i++) {
            el.mySendKeys( el.getOmerElement(listkutuVeYazi.get(i).get(0) ),
                    listkutuVeYazi.get(i).get(1) );
        }
    }

    @And("Fill the form for pay electricity bill" )
    public void fillTheFormForPayElectricityBill() {
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys("john"+ Keys.TAB).sendKeys("2020 Parkway Court"+ Keys.TAB)
                .sendKeys("Normal"+ Keys.TAB).sendKeys("IL"+ Keys.TAB)
                .sendKeys("61761"+ Keys.TAB).sendKeys("020649816"+ Keys.TAB)
                .sendKeys("13899"+ Keys.TAB).sendKeys("13899"+ Keys.TAB).sendKeys("1")
                .build()
                .perform();
    }


    @And("User should pay successfully" )
    public void userShouldPaySuccessfully() {
        el.wait.until(ExpectedConditions.visibilityOf(el.completeText));
        Assert.assertTrue(el.completeText.getText().contains("Complete"));
    }

    @And("Fill the form for pay electricity bill negative" )
    public void fillTheFormForPayElectricityBillNegative() {
        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys("john"+ Keys.TAB).sendKeys("2020 Parkway Court"+ Keys.TAB)
                .sendKeys("Normal"+ Keys.TAB).sendKeys("IL"+ Keys.TAB)
                .sendKeys("61761"+ Keys.TAB).sendKeys("020649816"+ Keys.TAB)
                .sendKeys("13899"+ Keys.TAB).sendKeys("13899"+ Keys.TAB).sendKeys("0")
                .build()
                .perform();
    }

    @And("User should not make the payment successfully" )
    public void userShouldNotMakeThePaymentSuccessfully() {
        el.wait.until(ExpectedConditions.visibilityOf(el.completeText));
        Assert.assertTrue(el.completeText.getText().contains("Complete"));
    }

}
