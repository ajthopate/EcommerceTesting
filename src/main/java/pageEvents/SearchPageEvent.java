package pageEvents;

import pageObjects.SearchPageElements;
import utils.ElementFetch;

public class SearchPageEvent {

    ElementFetch ele = new ElementFetch();

    public void item() {
        ele.getWebElement("XPATH", SearchPageElements.mensJacket).click();
    }
}
