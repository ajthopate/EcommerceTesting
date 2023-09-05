package pageEvents;

import pageObjects.CartPageElements;
import utils.ElementFetch;

public class CartPageEvents {

    ElementFetch ele = new ElementFetch();

    public void RemoveItem() {
        ele.getWebElement("XPATH", CartPageElements.removeButtonText).click();

    }

    public void CardPay() {
        ele.getWebElement("XPATH", CartPageElements.payCardButton).click();
    }

    public void Paypal() {
        ele.getWebElement("XPATH", CartPageElements.paypalButton).click();
    }

    public void CardCredentials() {

        ele.getWebElement("XPATH", CartPageElements.cardNumberInputText).sendKeys("4242424242424242");
        ele.getWebElement("XPATH", CartPageElements.cardDateInputText).sendKeys("827");
        ele.getWebElement("XPATH", CartPageElements.cardCVV).sendKeys("676");

    }

    public void Payment() {
        ele.getWebElement("XPATH", CartPageElements.makePaymentButton).click();
    }

    public void AnotherMethod() {
        ele.getWebElement("XPATH", CartPageElements.useAnotherPayment).click();
    }
}
