package pageEvents;

import pageObjects.RegisterPageElements;
import utils.ElementFetch;

public class RegisterPageEvents {
ElementFetch ele=new ElementFetch();
 public void Register(String name,String email,String password,String phone,String address,String answer){
     ele.getWebElement("XPATH", RegisterPageElements.nameInputText).sendKeys(name);
     ele.getWebElement("XPATH", RegisterPageElements.emailInputText).sendKeys(email);
     ele.getWebElement("XPATH", RegisterPageElements.passwordInputText).sendKeys(password);
     ele.getWebElement("XPATH", RegisterPageElements.phoneInputText).sendKeys(phone);
     ele.getWebElement("XPATH", RegisterPageElements.addressInputText).sendKeys(address);
     ele.getWebElement("XPATH", RegisterPageElements.answerInputText).sendKeys(answer);

     ele.getWebElement("XPATH", RegisterPageElements.submitButtonText).click();





 }

}
