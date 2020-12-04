package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ReporterConfig;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;



    @BeforeClass
    public void setupApp () throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications","start-maximized","incognito");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.bookswagon.com/login");

    }

    @AfterClass
    public void closeApp()
    {
        driver.quit();
    }
}
