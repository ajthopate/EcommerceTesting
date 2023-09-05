package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;
import utils.ReadXLSData;

public class SearchItemTest extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();

    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();

    SearchPageEvent search = new SearchPageEvent();

    @Test(dataProviderClass = ReadXLSData.class, dataProvider = "Data")
    public void searchItem(String item) {
        logger.info("Directed on Homepage");
        homepage.searchElements(item);
        logger.info("Item Searched Successfully");

    }
}
