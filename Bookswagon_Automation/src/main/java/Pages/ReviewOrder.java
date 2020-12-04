package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewOrder {

    WebDriver driver;

    public ReviewOrder(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_lnkbtnLogout")
    WebElement logOutButton;

    public void logOut() throws InterruptedException {
        Thread.sleep(2000);
        logOutButton.click();
        Thread.sleep(5000);
    }
}
