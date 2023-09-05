package pageObjects;

public interface UserPageElements {

    String userProfileText = "//a[normalize-space()='Update Profile']";

    String userProfileOrdersText = "//a[normalize-space()='Orders']";

    String userNameUpdateInput = "//input[@id='exampleInputName1']";

    String userPasswordUpdateInput = "//input[@id='exampleInputPassword1']";

    String userPhoneUpdateInput = "//input[@id='exampleInputPhone1']";

    String userAddressUpdateInput = "//input[@id='exampleInputAddress1']";

    String userUpdateButton = "//button[@id='userUpdateButton']";


}
