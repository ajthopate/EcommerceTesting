package pageObjects;

public interface HomePageElements {
    String signInButtonText = "//a[normalize-space()='Login']";

    String aboutDropdownText = "//div[@id='navbarTogglerDemo01']/ul/li/a[@id='navbarScrollingDropdown']";
    String aboutButtonText = "//a[@class='dropdown-item'][normalize-space()='About']";
    String contactUsText = "//a[normalize-space()='Contact']";
    String privacyButtonText = "//a[normalize-space()='Policy']";

    String categoriesButtonText = "//div[@id='navbarTogglerDemo01']/ul/li/a[@id='navbarCategoriesDropdown']";
    String searchBarText = "//input[@placeholder='Search']";
    String searchButton = "//button[@id='searchBtnInput']";
    String cartLogoText = "//a[@href='/cart']";

    String userProfileName = "//a[@id='userProfileName']";
    String userProfileDashboard = "//a[@id='userDashboard1']";
    String UserProfileLogout = "//a[@id='userLogout1']";

    //filters
    String kidsCheckboxButton = "//input[@name='Kids Collections']";
    String mensCheckboxButton = "//input[@name='Mens Collections']";
    String mobileCheckboxButton = "//input[@name='Mobile Phones']";
    String smartCheckboxButton = "//input[@name='Smart Watches']";
    String analogCheckboxButton = "//input[@name='Analog Watches']";
    String shoesCheckboxButton = "//input[@name='Shoes Collections']";
    String radio0to19 = "//input[@value='0,19']";
    String radio20to39 = "//input[@value='20,39']";
    String radio40to59 = "//input[@value='40,59']";
    String radio60to79 = "//input[@value='60,79']";
    String radio80to99 = "//input[@value='80,99']";
    String radio100andabove = "//input[@value='100,9999']";
    String resetButton = "//button[@class='resetBtn btn-danger']";


    String blueSmartWatchAddText="//button[@name='Blue Smart watch add']";
    String blueSmartWatchDetailText="//button[@name='Blue Smart watch details']";

}
