package pageEvents;

import org.openqa.selenium.JavascriptExecutor;
import pageObjects.HomePageElements;
import utils.ElementFetch;

import static base.BaseTest.driver;

public class HomePageEvents {
    ElementFetch ele = new ElementFetch();

    public void signInButton() {
        ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
    }

    public void aboutButton() {
        ele.getWebElement("XPATH", HomePageElements.aboutDropdownText).click();
    }

    public void aboutUs() {

        ele.getWebElement("XPATH", HomePageElements.aboutButtonText).click();
    }

    public void contactUs() {

        ele.getWebElement("XPATH", HomePageElements.contactUsText).click();
    }

    public void privacyButton() {

        ele.getWebElement("XPATH", HomePageElements.privacyButtonText).click();
    }

    public void Categories() {
        ele.getWebElement("XPATH", HomePageElements.categoriesButtonText).click();

    }

    public void searchElements(String item) {
        ele.getWebElement("XPATH", HomePageElements.searchBarText).sendKeys(item);
        ele.getWebElement("XPATH", HomePageElements.searchButton).click();
    }

    public void openCart() {
        ele.getWebElement("XPATH", HomePageElements.cartLogoText).click();
    }

    public void User() {
        ele.getWebElement("XPATH", HomePageElements.userProfileName).click();
    }

    public void UserDashboard() {
        ele.getWebElement("XPATH", HomePageElements.userProfileDashboard).click();
    }

    public void UserLogout() {
        ele.getWebElement("XPATH", HomePageElements.UserProfileLogout).click();
    }

    public void filter(String filter) throws InterruptedException {
        if (filter.equalsIgnoreCase("kids")) {
            ele.getWebElement("XPATH", HomePageElements.kidsCheckboxButton).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");

            Thread.sleep(500);

        } else if (filter.equalsIgnoreCase("mens")) {
            ele.getWebElement("XPATH", HomePageElements.mensCheckboxButton).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");

            Thread.sleep(500);
        } else if (filter.equalsIgnoreCase("mobiles")) {
            ele.getWebElement("XPATH", HomePageElements.mobileCheckboxButton).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");

            Thread.sleep(500);

        } else if (filter.equalsIgnoreCase("smartwatches")) {
            ele.getWebElement("XPATH", HomePageElements.smartCheckboxButton).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");

            Thread.sleep(500);

        } else if (filter.equalsIgnoreCase("analogwatches")) {
            ele.getWebElement("XPATH", HomePageElements.analogCheckboxButton).click();
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,450)");

            Thread.sleep(500);

        } else if (filter.equalsIgnoreCase("shoes")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,350)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.shoesCheckboxButton).click();

        } else if (filter.equalsIgnoreCase("0to19")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio0to19).click();

        } else if (filter.equalsIgnoreCase("20to39")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio20to39).click();

        } else if (filter.equalsIgnoreCase("40to59")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio40to59).click();

        } else if (filter.equalsIgnoreCase("60to79")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio60to79).click();

        } else if (filter.equalsIgnoreCase("80to99")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio80to99).click();

        } else if (filter.equalsIgnoreCase("100andabove")) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,550)");

            Thread.sleep(500);
            ele.getWebElement("XPATH", HomePageElements.radio100andabove).click();

        }
    }

    public void resetfilter() throws InterruptedException {

        ele.getWebElement("XPATH", HomePageElements.resetButton).click();
    }

    public void homePageAdd(){
        ele.getWebElement("XPATH", HomePageElements.blueSmartWatchAddText).click();
        ele.getWebElement("XPATH", HomePageElements.blueSmartWatchDetailText).click();
    }
}
