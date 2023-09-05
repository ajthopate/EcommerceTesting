package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ReadXLSData;

public class LoginTest extends BaseTest {

    HomePageEvents homepage=new HomePageEvents();
    LoginPageEvents loginpage=new LoginPageEvents();
    @Test(dataProviderClass = ReadXLSData.class,dataProvider = "Data")
    public void login(String username,String password) {
        logger.info("Directed on Homepage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");
        loginpage.checkIfLoginPageLoaded();
        logger.info("Login Page Checked");

        loginpage.enterCredentials(username, password);
        loginpage.login();
        logger.info("Logged in Successfully");

    }
}
