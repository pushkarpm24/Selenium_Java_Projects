package TestScript;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class linkedinTestClass {

  @Test
  public void LoginPageTest()
  {
      LoginPage login = new LoginPage();
      login.AccountLogin();
  }
}
