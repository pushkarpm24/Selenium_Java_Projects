package BookswagonTest;

import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void LoginPageTest()
    {
        LoginPage login = new LoginPage();
        login.AccountLogin();
    }
}
