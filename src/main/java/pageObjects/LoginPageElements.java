package pageObjects;

public interface LoginPageElements {

    String loginSignInButtonText="//button[@type='Submit']";

    String emailInputText="//input[@id='exampleInputEmail1']";
    String passwordInputText="//input[@id='exampleInputPassword1']";
    String forgotPasswordText="//a[contains(text(),'Forgot Password?')]";
    String registerPageText="//input[@value='Register']";

}
