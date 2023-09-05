package qa.test;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class AdminTest extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    FooterEvents footer = new FooterEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();
    UserPageEvents user = new UserPageEvents();
    AdminPageEvents admin = new AdminPageEvents();

    @Test(dataProviderClass = ReadXLSData.class,dataProvider = "Data")
    public void AdminTest(String username, String password, String createCategory, String category, String url, String name, String description, String price, String quantity, String shipping) throws InterruptedException {

        homepage.signInButton();
        loginpage.checkIfLoginPageLoaded();
        loginpage.enterCredentials(username, password);
        loginpage.login();

        homepage.User();
        homepage.UserDashboard();
        Thread.sleep(1000);

        admin.CreateCategoryButton();
        admin.CreateCategory(createCategory);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1050)");

        Thread.sleep(2000);
        admin.DeleteCategory();

        admin.CreateProductButton();
        admin.CreateProduct(category, url, name, description, price, quantity, shipping);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1050)");

        Thread.sleep(1000);
        admin.CreateProduct();

        admin.ProductsButton();

        admin.OrdersButton();

        homepage.User();
        homepage.UserLogout();
    }

}
