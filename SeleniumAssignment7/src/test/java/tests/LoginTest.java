package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    // Test 1: Invalid Login
    @Test
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wronguser", "wrongpassword");

        String error = loginPage.getErrorMessage();

        Assert.assertTrue(
                error.contains("Username and password do not match")
        );
    }

    // Test 2: Successful Login
    @Test
    public void successfulLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        // Verify user is redirected to the products/home page
        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory")
        );
    }
}
