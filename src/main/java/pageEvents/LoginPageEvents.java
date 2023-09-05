package pageEvents;

import dev.failsafe.internal.util.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
    ElementFetch ele = new ElementFetch();

    public void checkIfLoginPageLoaded() {
        Assert.isTrue(ele.getWebElements("XPATH", LoginPageElements.loginSignInButtonText).size() >0, "Element Not Found");
    }

    public void enterCredentials(String username,String password) {
        ele.getWebElement("XPATH", LoginPageElements.emailInputText).sendKeys(username);
        ele.getWebElement("XPATH", LoginPageElements.passwordInputText).sendKeys(password);
    }
    public void login(){
        ele.getWebElement("XPATH",LoginPageElements.loginSignInButtonText).click();
    }
    public void forgotPassword(){
        ele.getWebElement("XPATH",LoginPageElements.forgotPasswordText).click();
    }

    public void registerPage(){
        ele.getWebElement("XPATH",LoginPageElements.registerPageText).click();
    }

}
