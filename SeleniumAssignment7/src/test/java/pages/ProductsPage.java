package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ProductsPage extends BasePage {

    By backpack = By.id("item_4_title_link");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickBackpack() {
        click(backpack);
    }
}