package pageObjects;

public interface CartPageElements {

    String removeButtonText="/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]";

    String pleaseLoginButton="//button[contains(@class,'btn btn-outline-warning')]";

    String updateAddressButton="//button[contains(@class,'updateBtn btn-outline-warning')]";

    String payCardButton="//div[@aria-label='Paying with Card']";

    String cardNumberInputText="//input[@id='credit-card-number']";
    String cardDateInputText="//input[@id='expiration']";

    String cardCVV="//input[@id='cvv']";

    String useAnotherPayment="//div[@class='braintree-large-button braintree-toggle']";

    String paypalButton="//div[@aria-label='Paying with PayPal']";

    String makePaymentButton="//button[@class='payBtn btn-primary']";
}
