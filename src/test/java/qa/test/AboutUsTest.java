package qa.test;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;
import utils.ElementFetch;

public class AboutUsTest extends BaseTest {
    ElementFetch ele = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginpage = new LoginPageEvents();
    FooterEvents footer = new FooterEvents();
    RegisterPageEvents registerpage = new RegisterPageEvents();
    ForgotPasswordEvents forgotpassword = new ForgotPasswordEvents();


    @Test
    public void MethodForAboutUs() throws InterruptedException {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.aboutUs();
        logger.info("Clicked on About Us");
        Thread.sleep(1000);
        footer.FooterAboutUs();
        Thread.sleep(1000);
        footer.FooterContactUs();
        Thread.sleep(1000);
        footer.FooterPolicy();
    }

    @Test
    public void MethodForContactUs() {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.contactUs();
        logger.info("Clicked on Contact Us");
        footer.FooterAboutUs();
        footer.FooterContactUs();
        footer.FooterPolicy();

    }

    @Test
    public void MethodForPrivacyPolicy() {
        logger.info("Directed on Homepage");
        homepage.aboutButton();
        logger.info("Clicked on About us Dropdown");
        homepage.privacyButton();
        logger.info("Clicked on Privacy Policy");
        footer.FooterAboutUs();
        footer.FooterContactUs();
        footer.FooterPolicy();
    }
}
