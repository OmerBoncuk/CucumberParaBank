package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends ParentPage{
    public Elements() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password2;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement loginbutton;

    @FindBy(css="[href='transfer.htm']")
    public WebElement transferFunds;

    @FindBy(css="[id='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(css="[id='toAccountId']")
    public WebElement toAccount;

    @FindBy(css="[id='amount']")
    public WebElement amount;

    @FindBy(css="[value='Transfer']")
    public WebElement transfer;

    @FindBy(css="[id='showResult']>:nth-child(2)")
    public WebElement showResult;

    @FindBy(css="[href='overview.htm']")
    public WebElement accountsOverview;

    @FindBy(css="[id='accountTable']>:nth-child(2)>:nth-child(1)>:nth-child(1)>:nth-child(1)")
    public WebElement accountNumber;

    @FindBy(css="[href='findtrans.htm']")
    public WebElement findTransactions;

    @FindBy(css="[id='transactionId']")
    public WebElement transactionID;

    @FindBy(css="[id='findById']")
    public WebElement findTransaction;

    @FindBy(css="[id='transactionTable']>:nth-child(2)>:nth-child(2)>:nth-child(2)>:nth-child(1)")
    public WebElement fundTransferReceived;

    @FindBy(css="[id='rightPanel'] >:nth-child(2)>:nth-child(1)>:nth-child(1)>:nth-child(2)")
    public WebElement transactionIDnumber;

    @FindBy(css="[id='rightPanel']>:nth-child(2)>:nth-child(1)>:nth-child(5)>:nth-child(2)")
    public WebElement idAmount;

    @FindBy(css="[id='findByAmount']")
    public WebElement findByAmount;

    @FindBy(css = "[id='leftPanel'] :nth-child(7)")
    public WebElement requestLoanBTN;

    @FindBy(id = "amount")
    public WebElement loanAmount;

    @FindBy(id = "downPayment")
    public WebElement downPayment;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountId;

    @FindBy(css = "[value='Apply Now']")
    public WebElement applyNowBTN;

    @FindBy(id = "loanProviderName")
    public WebElement loanProviderName;

    @FindBy(id = "loanStatus")
    public WebElement loanStatus;

    @FindBy(id = "loanRequestApproved")
    public WebElement loanRequestMSG;

    @FindBy(id = "loanRequestDenied")
    public WebElement loanRequestMSGDenied;

    @FindBy(id = "newAccountId")
    public WebElement newAccountId;

    @FindBy(id = "accountType")
    public WebElement accountType;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "availableBalance")
    public WebElement availableBalance;

    @FindBy(id = "noTransactions")
    public WebElement noTransactions;

    @FindBy(linkText="Register")
    public WebElement register;

    @FindBy(id="customer.firstName")
    public WebElement firstName;

    @FindBy(id="customer.lastName")
    public WebElement lastName;

    @FindBy(id="customer.address.street")
    public WebElement address;

    @FindBy(id="customer.address.city")
    public WebElement city;

    @FindBy(id="customer.address.state")
    public WebElement state;

    @FindBy(id="customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id="customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id="customer.ssn")
    public WebElement ssn;

    @FindBy(id="customer.username")
    public WebElement userName;

    @FindBy(id="customer.password")
    public WebElement password;

    @FindBy(id="repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath="(//*[@class='button'])[3]")
    public WebElement RegisterDone;

    @FindBy(xpath="//*[@class='title']")
    public WebElement headText;

    @FindBy(xpath="//div[@id='leftPanel']//li[1]")
    public WebElement OpenNewAccount;

    @FindBy(xpath="//div[@id='openAccountForm']//select[1]/option[1]")
    public WebElement CheckingOpt;

    @FindBy(xpath="//div[@id='openAccountForm']//select[1]/option[2]")
    public WebElement SavingOpt;

    @FindBy(xpath="//div[@id='openAccountForm']//select[2]/option[1]")
    public WebElement AccountSelect;

    @FindBy(xpath="//input[@value='Open New Account']")
    public WebElement ConfirmOpenNewAccount;

    @FindBy(xpath="//div[@id='openAccountResult']//h1")
    public WebElement CongMessage;
 
    @FindBy(linkText = "Bill Pay")
    public WebElement billPayBtn;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymentBtn;

    @FindBy(id="billpayResult")
    public WebElement completeText;

    @FindBy(linkText="Update Contact Info")
    public WebElement updateContactBtn;

    @FindBy(css="input[value='Update Profile']")
    public WebElement updateProfileBtn;

    @FindBy(id="updateProfileResult")
    public WebElement updateProfileText;

    public WebElement getOmerElement(String strElement)
    {
        switch (strElement)
        {
            case "billPayBtn" : return this.billPayBtn;
            case "payeeName" : return this.payeeName;
            case "sendPaymentBtn" : return this.sendPaymentBtn;
            case "updateContactBtn" : return this.updateContactBtn;
            case "updateProfileBtn" : return this.updateProfileBtn;
        }

        return null;
    }
    

}
