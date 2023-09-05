package pageEvents;

import pageObjects.ForgotPasswordElements;
import utils.ElementFetch;

public class ForgotPasswordEvents {

    ElementFetch ele = new ElementFetch();

    public void ForgotPassword(String username, String answer, String password) {
        ele.getWebElement("XPATH", ForgotPasswordElements.usernameText).sendKeys(username);
        ele.getWebElement("XPATH", ForgotPasswordElements.answerInputText).sendKeys(answer);
        ele.getWebElement("XPATH", ForgotPasswordElements.newPasswordText).sendKeys(password);
        ele.getWebElement("XPATH", ForgotPasswordElements.resetButtonText).click();

    }
}
