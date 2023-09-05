package pageEvents;

import base.BaseTest;
import pageObjects.MoreDetailsElements;
import utils.ElementFetch;

public class MoreDetailsEvents extends BaseTest {

    ElementFetch ele=new ElementFetch();

    public void addToCart(){
        ele.getWebElement("XPATH", MoreDetailsElements.blueSmartWatchAddText).click();
    }

    public void relatedProduct(){
        ele.getWebElement("XPATH", MoreDetailsElements.newWatchText).click();
    }
}
