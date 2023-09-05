package pageEvents;

import pageObjects.CategoriesPageElements;
import utils.ElementFetch;

public class CategoriesPageEvents {

    ElementFetch ele = new ElementFetch();

    public void AllCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.allCategoriesDropdownText).click();

    }

    public void KidsCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.kidsCategoriesDropdownButton).click();
    }

    public void MensCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.mensCategoriesDropdownButton).click();
    }

    public void MobileCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.mobileCategoriesDropdownButton).click();
    }

    public void AnalogWatchCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.analogWatchCategoriesDropdownButton).click();
    }

    public void SmartWatchCategories() {
        ele.getWebElement("XPATH", CategoriesPageElements.smartWatchCategoriesDropdownButton).click();
    }

    public void category(String category) {
        if (category.equalsIgnoreCase("kids")) {
            ele.getWebElement("XPATH", CategoriesPageElements.kidsCategoriesButton).click();

        } else if (category.equalsIgnoreCase("mens")) {
            ele.getWebElement("XPATH", CategoriesPageElements.mensCategoriesButton).click();
        } else if (category.equalsIgnoreCase("mobiles")) {
            ele.getWebElement("XPATH", CategoriesPageElements.mobileCategoriesButton).click();

        } else if (category.equalsIgnoreCase("smartwatches")) {
            ele.getWebElement("XPATH", CategoriesPageElements.smartWatchCategoriesButton).click();

        } else if (category.equalsIgnoreCase("analogwatches")) {
            ele.getWebElement("XPATH", CategoriesPageElements.analogWatchCategoriesButton).click();

        }

    }

    public void categoryDrop(String category) {
        if (category.equalsIgnoreCase("kids")) {
            ele.getWebElement("XPATH", CategoriesPageElements.kidsCategoriesDropdownButton).click();

        } else if (category.equalsIgnoreCase("mens")) {
            ele.getWebElement("XPATH", CategoriesPageElements.mensCategoriesDropdownButton).click();
        } else if (category.equalsIgnoreCase("mobiles")) {
            ele.getWebElement("XPATH", CategoriesPageElements.mobileCategoriesDropdownButton).click();

        } else if (category.equalsIgnoreCase("smartwatches")) {
            ele.getWebElement("XPATH", CategoriesPageElements.smartWatchCategoriesDropdownButton).click();

        } else if (category.equalsIgnoreCase("analogwatches")) {
            ele.getWebElement("XPATH", CategoriesPageElements.analogWatchCategoriesDropdownButton).click();

        }

    }
}

