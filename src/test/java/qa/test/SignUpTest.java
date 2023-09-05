package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import pageEvents.RegisterPageEvents;
import utils.ElementFetch;
import utils.ReadXLSData;

public class SignUpTest extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();

    RegisterPageEvents registerpage = new RegisterPageEvents();

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void register(String name, String email, String password, String phone, String address, String answer) {
        logger.info("Directed on HomePage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");

        loginpage.registerPage();

        logger.info("Clicked on Register Button");
        registerpage.Register(name, email, password, phone, address, answer);
        logger.info("Registered Successfully");

    }


}
