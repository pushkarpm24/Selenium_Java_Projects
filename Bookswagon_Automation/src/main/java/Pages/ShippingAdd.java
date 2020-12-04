package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAdd {

    WebDriver driver;

    public ShippingAdd(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@href='shippingoption.aspx']")
    WebElement continueButton;

    //Shipping Address
    @FindBy(id = "ctl00_cpBody_txtNewRecipientName")
    WebElement name;

    @FindBy(id = "ctl00_cpBody_txtNewCompanyName")
    WebElement companyName;

    @FindBy(id = "ctl00_cpBody_txtNewAddress")
    WebElement streetAddress;

    @FindBy(id = "ctl00_cpBody_ddlNewState")
    WebElement state;

    @FindBy(xpath = "//option[@value='MH']" )
    WebElement MH;

    @FindBy(id = "ctl00_cpBody_txtNewCity")
    WebElement city;

    @FindBy(id = "ctl00_cpBody_txtNewPincode")
    WebElement pinCode;

    @FindBy(id = "ctl00_cpBody_txtNewMobile")
    WebElement mobile;

    @FindBy(id = "ctl00_cpBody_imgSaveNew")
    WebElement saveAndContinue;

    public void Address() throws InterruptedException {
        Thread.sleep(2000);
        continueButton.click();
        Thread.sleep(2000);
        name.sendKeys("Pushkar");
        Thread.sleep(3000);
        streetAddress.sendKeys("Teacher Colony");
        Thread.sleep(3000);
        state.click();
        MH.click();
        city.sendKeys("Aheri");
        Thread.sleep(3000);
        pinCode.sendKeys("442705");
        Thread.sleep(3000);
        mobile.sendKeys("7768076656");
        Thread.sleep(3000);
        saveAndContinue.click();
        Thread.sleep(5000);
    }
}
