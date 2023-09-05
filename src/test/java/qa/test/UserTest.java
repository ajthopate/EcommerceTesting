package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class UserTest extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    FooterEvents footer = new FooterEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();
    UserPageEvents user = new UserPageEvents();


    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void UserTest(String username, String Password, String name, String phone, String address) {
        homepage.signInButton();
        loginpage.checkIfLoginPageLoaded();
        loginpage.enterCredentials(username, Password);
        loginpage.login();

        homepage.User();
        homepage.UserDashboard();

        user.UpdateProfile(name, phone, address);

        user.UserOrders();

        homepage.User();
        homepage.UserLogout();
    }


}
