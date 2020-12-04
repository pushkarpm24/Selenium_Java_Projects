package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public boolean flag;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_phBody_SignIn_txtEmail")
    WebElement email;

    @FindBy(id = "ctl00_phBody_SignIn_txtPassword")
    WebElement password;

    @FindBy(id = "ctl00_phBody_SignIn_btnLogin")
    WebElement login_button;

    @FindBy(xpath = "//title[contains(text(),'Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com' )]")
    WebElement verification;


    public void AccountLogin(){
        email.sendKeys("moreypush24@gmail.com");
        password.sendKeys("pushkaru24");
        login_button.click();

        if(verification.toString().contains(driver.getTitle())) {
            flag = true;
        }

    }
}
