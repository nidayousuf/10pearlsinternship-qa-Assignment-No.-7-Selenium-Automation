package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import pages.ProductDetailsPage;
import utils.BaseTest;

public class ProductTest extends BaseTest {

    @Test
    public void productNavigationTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Navigate to product
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.clickBackpack();

        // Validate product details
        ProductDetailsPage productPage =
                new ProductDetailsPage(driver);

        Assert.assertEquals(
                productPage.getProductName(),
                "Sauce Labs Backpack"
        );

        Assert.assertTrue(
                productPage.getProductPrice().contains("$")
        );

        Assert.assertTrue(
                productPage.getProductDescription().length() > 0
        );
    }
}