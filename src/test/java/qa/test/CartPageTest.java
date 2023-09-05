package qa.test;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class CartPageTest extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    FooterEvents footer = new FooterEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();
    SearchPageEvent searchAdd = new SearchPageEvent();
    CartPageEvents cart = new CartPageEvents();


    @Test(dataProviderClass = ReadXLSData.class,dataProvider = "Data")
    public void AddItemToCart(String username, String password, String item) throws InterruptedException {
        homepage.signInButton();
        loginpage.checkIfLoginPageLoaded();
        loginpage.enterCredentials(username, password);
        loginpage.login();
        homepage.searchElements(item);
        Thread.sleep(1000);
        searchAdd.item();
        homepage.openCart();
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10050)");

        Thread.sleep(2000);
        cart.CardPay();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10050)");

//        Thread.sleep(1000);
//        cart.CardCredentials();
//        Thread.sleep(1000);
//        cart.Payment();
//        cart.AnotherMethod();
//        Thread.sleep(1000);
//        cart.Paypal();
    }

}
