package pageEvents;

import org.openqa.selenium.JavascriptExecutor;
import pageObjects.AdminPageElements;
import utils.ElementFetch;

import static base.BaseTest.driver;

public class AdminPageEvents {

    ElementFetch ele = new ElementFetch();

    public void CreateCategoryButton() {
        ele.getWebElement("XPATH", AdminPageElements.createCategoryText).click();
    }

    public void CreateCategory(String category) {
        ele.getWebElement("XPATH", AdminPageElements.createCategoryInputText).sendKeys(category);
        ele.getWebElement("XPATH", AdminPageElements.createCategoryButtonText).click();
    }

    public void DeleteCategory() {
        ele.getWebElement("XPATH", AdminPageElements.deleteCategoryTest).click();
    }

    public void CreateProductButton() {
        ele.getWebElement("XPATH", AdminPageElements.createProductsText).click();
    }

    public void CreateProduct(String category, String url, String name, String description, String price, String quantity, String shipping) throws InterruptedException {
        ele.getWebElement("XPATH", AdminPageElements.selectCategoryForProduct).click();
        Thread.sleep(1000);

        if (category.equalsIgnoreCase("kids")) {
            ele.getWebElement("XPATH", AdminPageElements.kidsCategory).click();
        } else if (category.equalsIgnoreCase("mens")) {
            ele.getWebElement("XPATH", AdminPageElements.mensCategory).click();
        } else if (category.equalsIgnoreCase("mobiles")) {
            ele.getWebElement("XPATH", AdminPageElements.mobileCategory).click();
        } else if (category.equalsIgnoreCase("smartwatches")) {
            ele.getWebElement("XPATH", AdminPageElements.smartWatchCategory).click();
        } else if (category.equalsIgnoreCase("analogwatches")) {
            ele.getWebElement("XPATH", AdminPageElements.analogWatchCategory).click();
        } else if (category.equalsIgnoreCase("shoes")) {
            ele.getWebElement("XPATH", AdminPageElements.shoesCategory).click();
        }

        ele.getWebElement("XPATH", AdminPageElements.uploadPhotoProduct).sendKeys(url);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,20000)");

        Thread.sleep(1000);
        ele.getWebElement("XPATH", AdminPageElements.uploadProductName).sendKeys(name);
        ele.getWebElement("XPATH", AdminPageElements.uploadProductDescription).sendKeys(description);
        ele.getWebElement("XPATH", AdminPageElements.uploadProductPrice).sendKeys(price);
        ele.getWebElement("XPATH", AdminPageElements.uploadProductQuantity).sendKeys(quantity);
        Thread.sleep(1000);
        ele.getWebElement("XPATH", AdminPageElements.uploadProductShipping).click();
        Thread.sleep(1000);

        if (shipping.equalsIgnoreCase("yes")) {
            ele.getWebElement("XPATH", AdminPageElements.uploadProductShippingYes).click();
        } else {
            ele.getWebElement("XPATH", AdminPageElements.uploadProductShippingNo).click();
        }

    }

    public void CreateProduct(){
        ele.getWebElement("XPATH", AdminPageElements.createProductButton).click();
    }

    public void ProductsButton() {
        ele.getWebElement("XPATH", AdminPageElements.productsText).click();
    }

    public void OrdersButton() {
        ele.getWebElement("XPATH", AdminPageElements.ordersText).click();
    }


}
