package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import utils.ReadXLSData;

public class FilterTest extends BaseTest {

    HomePageEvents home = new HomePageEvents();

    @Test(dataProviderClass = ReadXLSData.class,dataProvider = "Data")
    public void Filter(String filter) throws InterruptedException {

        home.filter(filter);
//        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");
//
//        Thread.sleep(1500);

        home.resetfilter();

    }


}
