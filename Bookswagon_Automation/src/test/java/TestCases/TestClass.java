package TestCases;

import Pages.*;
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

    @Test(priority = 3)
    public void BookCartFrameTest() throws InterruptedException {
        BookCartFrame buy = new BookCartFrame(driver);
        buy.buyBook();
    }

    @Test(priority = 4)
    public void ShippingAddTest() throws InterruptedException {
        ShippingAdd add = new ShippingAdd(driver);
        add.Address();
    }

    @Test(priority = 5)
    public void ReviewOrderTest() throws InterruptedException {
        ReviewOrder order = new ReviewOrder(driver);
        order.logOut();
    }


}
