package qa.test;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.MoreDetailsEvents;
import utils.ElementFetch;

public class HomepageTest extends BaseTest {

    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    MoreDetailsEvents moredetails = new MoreDetailsEvents();

    @Test
    public void HomePageAdd() throws InterruptedException {

        //Assert.isTrue(ele.getWebElements("XPATH",HomePageElements.blueSmartWatchDetailText ).size() >0, "Element Not Found");


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


}
