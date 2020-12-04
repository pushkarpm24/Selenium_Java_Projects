package TestCases;

import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @Test
    public void LoginPageTest()
    {
        LoginPage login = new LoginPage(driver);
        login.AccountLogin();
    }


}
