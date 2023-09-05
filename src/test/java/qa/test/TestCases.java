package qa.test;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class TestCases extends BaseTest {
    ElementFetch ele = new ElementFetch();
    AdminPageEvents admin = new AdminPageEvents();
    UserPageEvents user = new UserPageEvents();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();
    CategoriesPageEvents categories = new CategoriesPageEvents();
    FooterEvents footer = new FooterEvents();
    SearchPageEvent searchAdd = new SearchPageEvent();
    SearchPageEvent search = new SearchPageEvent();
    CartPageEvents cart = new CartPageEvents();
    MoreDetailsEvents moredetails = new MoreDetailsEvents();

    // Home Page Test

    @Test
    public void HomePageAdd() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1050)");

        Thread.sleep(2000);
        homepage.homePageAdd();
        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1050)");

        Thread.sleep(1000);
        moredetails.addToCart();

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1050)");

        Thread.sleep(1000);
        moredetails.relatedProduct();
    }


    // Sign In Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void Login(String username, String password) {
        logger.info("Directed on Homepage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");
        loginpage.checkIfLoginPageLoaded();
        logger.info("Login Page Checked");
        loginpage.enterCredentials(username, password);
        loginpage.login();
        logger.info("Logged in Successfully");
    }

    // Sign Up Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void Register(String name, String email, String password, String phone, String address, String answer) {
        logger.info("Directed on HomePage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");
        loginpage.registerPage();
        logger.info("Clicked on Register Button");
        registerpage.Register(name, email, password, phone, address, answer);
        logger.info("Registered Successfully");
    }

    // Forgot Password Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void ForgotPassword(String username, String answer, String password) {
        logger.info("Directed on HomePage");
        homepage.signInButton();
        logger.info("Clicked on Login Button");
        loginpage.forgotPassword();
        logger.info("Clicked on Forgot Password Button");
        forgotpassword.ForgotPassword(username, answer, password);
        logger.info("Password Reset Successfully");
    }

    // About Us Test

    @Test
    public void MethodForAboutUs() throws InterruptedException {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.aboutUs();
        logger.info("Clicked on About Us");
        footer.FooterAboutUs();
        footer.FooterContactUs();
        footer.FooterPolicy();
    }

    // Contact Us Test

    @Test
    public void MethodForContactUs() {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.contactUs();
        logger.info("Clicked on Contact Us");
        footer.FooterAboutUs();
        footer.FooterContactUs();
        footer.FooterPolicy();
    }

    // Privacy Policy Test

    @Test
    public void MethodForPrivacyPolicy() {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.privacyButton();
        logger.info("Clicked on Privacy Policy");
        footer.FooterAboutUs();
        footer.FooterContactUs();
        footer.FooterPolicy();
    }

    // Search Item Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void SearchItem(String item) {
        logger.info("Directed on Homepage");
        homepage.searchElements(item);
        logger.info("Item Searched Successfully");
    }

    // All Categories Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void AllCategories(String category) throws InterruptedException {
        logger.info("Directed on HomePage");
        homepage.Categories();
        logger.info("Clicked on Categories Button");
        categories.AllCategories();
        logger.info("Clicked on All Categories");
        categories.category(category);
        Thread.sleep(3000);
    }

    // Particular Category Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void Category(String category) throws InterruptedException {
        logger.info("Directed on HomePage");
        homepage.Categories();
        logger.info("Clicked on Categories Button");
        categories.categoryDrop(category);
        Thread.sleep(3000);
    }

    // Cart Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
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
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1050)");

        Thread.sleep(2000);
        cart.CardPay();
//        Thread.sleep(1000);
//        cart.AnotherMethod();
//        Thread.sleep(1000);
//        cart.Paypal();
    }


    // Admin Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
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

        Thread.sleep(2000);

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

    // User Test

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

    // Filter Test

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void Filter(String filter) throws InterruptedException {

        homepage.filter(filter);
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");
//
//        Thread.sleep(1500);
        homepage.resetfilter();

    }


}
