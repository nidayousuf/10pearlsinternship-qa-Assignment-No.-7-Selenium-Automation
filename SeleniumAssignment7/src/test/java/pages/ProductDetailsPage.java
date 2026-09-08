package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ProductDetailsPage extends BasePage {

    By productName = By.className("inventory_details_name");
    By productPrice = By.className("inventory_details_price");
    By productDescription = By.className("inventory_details_desc");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return getText(productName);
    }

    public String getProductPrice() {
        return getText(productPrice);
    }

    public String getProductDescription() {
        return getText(productDescription);
    }
}