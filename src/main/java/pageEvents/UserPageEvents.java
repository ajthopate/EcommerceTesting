package pageEvents;

import pageObjects.UserPageElements;
import utils.ElementFetch;

public class UserPageEvents {

    ElementFetch ele=new ElementFetch();

    public void UpdateProfile(String name, String phone, String address){

        ele.getWebElement("XPATH",UserPageElements.userProfileText).click();
        ele.getWebElement("XPATH",UserPageElements.userNameUpdateInput).clear();
        ele.getWebElement("XPATH",UserPageElements.userNameUpdateInput).sendKeys(name);
        ele.getWebElement("XPATH",UserPageElements.userPhoneUpdateInput).clear();
        ele.getWebElement("XPATH",UserPageElements.userPhoneUpdateInput).sendKeys(phone);
        ele.getWebElement("XPATH",UserPageElements.userAddressUpdateInput).clear();
        ele.getWebElement("XPATH",UserPageElements.userAddressUpdateInput).sendKeys(address);
        ele.getWebElement("XPATH",UserPageElements.userUpdateButton).click();

    }

    public void UserOrders(){
        ele.getWebElement("XPATH",UserPageElements.userProfileOrdersText).click();

    }
}
