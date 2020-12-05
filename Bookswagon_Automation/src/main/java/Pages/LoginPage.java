package Pages;

import excel.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    Credentials cred = new Credentials("C:\\Users\\HP\\IdeaProjects\\Selenium_Java_Projects\\Bookswagon_Automation\\src\\main\\java\\excel\\Bookswagon_credentials123.xlsx");

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

    public void AccountLogin(){
        email.sendKeys(cred.getData(0,1,0));
        password.sendKeys(cred.getData(0,1,1));
        login_button.click();
    }
}
