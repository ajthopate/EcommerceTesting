package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class CategoriesTest extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();
    CategoriesPageEvents categories = new CategoriesPageEvents();


    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void Category(String category) throws InterruptedException {
        logger.info("Directed on HomePage");
        homepage.Categories();
        logger.info("Clicked on Categories Button");
        categories.categoryDrop(category);
        Thread.sleep(3000);
    }

    // All categories Test


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

    // Differnt Test

//    @Test
//    public void MethodForKidCategories(){
//        logger.info("Directed on HomePage");
//        homepage.Categories();
//        logger.info("Clicked on Categories Button");
//        categories.KidsCategories();
//        logger.info("Clicked on Kids Categories");
//
//    }
//    @Test
//    public void MethodForMensCategories(){
//        logger.info("Directed on HomePage");
//        homepage.Categories();
//        logger.info("Clicked on Categories Button");
//        categories.MensCategories();
//        logger.info("Clicked on Mens Categories");
//
//    }
//    @Test
//    public void MethodForMobileCategories(){
//        logger.info("Directed on HomePage");
//        homepage.Categories();
//        logger.info("Clicked on Categories Button");
//        categories.MobileCategories();
//        logger.info("Clicked on Mobile Categories");
//
//    }
//    @Test
//    public void MethodForAnalogWatchesCategories(){
//        logger.info("Directed on HomePage");
//        homepage.Categories();
//        logger.info("Clicked on Categories Button");
//        categories.AnalogWatchCategories();
//        logger.info("Clicked on Analog Watches Categories");
//
//    }
//
//    @Test
//    public void MethodForSmartWatchesCategories(){
//        logger.info("Directed on HomePage");
//        homepage.Categories();
//        logger.info("Clicked on Categories Button");
//        categories.SmartWatchCategories();
//        logger.info("Clicked on Smart Watches Categories");
//
//    }


}
