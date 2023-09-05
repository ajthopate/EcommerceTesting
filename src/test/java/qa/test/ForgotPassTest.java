package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.ForgotPasswordEvents;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.RegisterPageEvents;
import utils.ElementFetch;
import utils.ReadXLSData;

public class ForgotPassTest extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();

    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void forgotPassword(String username, String answer, String password) {
        logger.info("Directed on HomePage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");
        loginpage.forgotPassword();
        logger.info("Clicked on Forgot Password Button");
        forgotpassword.ForgotPassword(username, answer, password);
        logger.info("Password Reset Successfully");

    }
}
