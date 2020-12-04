package TestCases;

import Pages.*;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @Test(priority = 1)
    public void LoginPageTest()
    {
        LoginPage login = new LoginPage(driver);
        login.AccountLogin();
        String my_title = driver.getTitle();
        String expected_title = "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com";
        Assert.assertEquals(my_title,expected_title);
    }

    @Test(priority = 2)
    public void HomePageTest()
    {
        HomePage home = new HomePage(driver);
        home.search_Book();
        Assert.assertTrue(driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[2]/div[3]/div[2]/div[1]/div[2]/a[1]/img[1]")).isDisplayed());
    }

    @Test(priority = 3)
    public void BookCartFrameTest() throws InterruptedException {
        BookCartFrame buy = new BookCartFrame(driver);
        buy.buyBook();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).isDisplayed());
    }

    @Test(priority = 4)
    public void ShippingAddTest() throws InterruptedException {
        ShippingAdd add = new ShippingAdd(driver);
        add.Address();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Order Summary')]")).isDisplayed());
    }

    @Test(priority = 5)
    public void ReviewOrderTest() throws InterruptedException {
        ReviewOrder order = new ReviewOrder(driver);
        order.logOut();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_btnSubmit']")).isDisplayed());
    }
}
