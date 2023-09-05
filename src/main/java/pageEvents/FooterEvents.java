package pageEvents;

import pageObjects.FooterElements;
import utils.ElementFetch;

public class FooterEvents {

    ElementFetch ele=new ElementFetch();

    public void FooterAboutUs(){
        ele.getWebElement("XPATH", FooterElements.aboutUsFooterText).click();
    }
    public void FooterContactUs(){
        ele.getWebElement("XPATH", FooterElements.contactUsFooterText).click();
    }
    public void FooterPolicy(){
        ele.getWebElement("XPATH", FooterElements.PolicyFooterText).click();
    }



}
