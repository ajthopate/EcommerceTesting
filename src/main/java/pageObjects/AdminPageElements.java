package pageObjects;

public interface AdminPageElements {

    String createCategoryText = "//a[normalize-space()='Create Category']";

    String createCategoryInputText = "//input[@placeholder='Enter new category']";

    String createCategoryButtonText = "//button[normalize-space()='Submit']";

    String deleteCategoryTest="//button[@name='Games delete']";


    String createProductsText = "//a[normalize-space()='Create Product']";
    String selectCategoryForProduct = "//input[@id='selectCategoryDrop']";
    String kidsCategory = "//div[contains(text(),'Kids Collections')]";
    String mensCategory = "//div[contains(text(),'Mens Collections')]";
    String mobileCategory = "//div[contains(text(),'Mobile Phones')]";

    String smartWatchCategory = "//div[contains(text(),'Smart Watches')]";
    String analogWatchCategory = "//div[@title='Analog Watches']";
    String shoesCategory = "//div[contains(text(),'Shoes')]";

    String createProductButton = "//button[@id='createProductButton']";


    String uploadPhotoProduct = "//input[@name='photo']";
    String uploadProductName = "//input[@placeholder='write a name']";
    String uploadProductDescription = "//textarea[@placeholder='write a description']";
    String uploadProductPrice = "//input[@placeholder='write a Price']";
    String uploadProductQuantity = "//input[@placeholder='write a quantity']";
    String uploadProductShipping = "//input[@id='shippingStatus']";
    String uploadProductShippingYes = "//div[@title='Yes']";
    String uploadProductShippingNo = "//div[contains(text(),'No')]";


    String productsText = "//a[normalize-space()='Products']";
    String ordersText = "//a[normalize-space()='Orders']";


}
