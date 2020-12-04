package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @Test(priority = 1)
    public void LoginPageTest()
    {
        LoginPage login = new LoginPage(driver);
        login.AccountLogin();
    }

    @Test(priority = 2)
    public void HomePageTest()
    {
        HomePage home = new HomePage(driver);
        home.search_Book();
    }


}
