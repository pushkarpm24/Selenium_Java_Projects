package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookCartFrame {

    public WebDriver driver;

    public BookCartFrame(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@href='https://www.bookswagon.com/book/harry-potter/9781608870394']" )
    WebElement book;

    @FindBy(xpath = "//input[@value='Buy Now']")
    WebElement buyNow;

    @FindBy(xpath ="//iframe[@class='cboxIframe']")
    WebElement newFrame;

    @FindBy(id ="BookCart_lvCart_imgPayment")
    WebElement placeOrder;

    public void buyBook() throws InterruptedException {
        book.click();
        Thread.sleep(2000);
        buyNow.click();
        Thread.sleep(5000);
        driver.switchTo().frame(newFrame);
        placeOrder.click();
        Thread.sleep(3000);
    }
}
