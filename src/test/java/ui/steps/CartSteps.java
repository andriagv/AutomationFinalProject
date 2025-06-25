package ui.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import ui.pages.LoginPage;
import ui.pages.ProductsPage;
import utils.DriverManager;

public class CartSteps {
    private ProductsPage productsPage;
    private LoginPage loginPage;


    public CartSteps() {
        WebDriver driver = DriverManager.getDriver();
        this.productsPage = new ProductsPage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @When("User adds {string} to cart")
    public void user_adds_to_cart(String productName) {
        productsPage.addProductToCart(productName);
    }

    @Then("Product should appear in cart")
    public void product_should_appear_in_cart() {
        Assert.assertTrue(productsPage.isCartBadgeDisplayed(), "Cart badge is not displayed");
    }

    @Then("Cart badge should show {string}")
    public void cart_badge_should_show(String expectedCount) {
        String actualCount = productsPage.getCartBadgeText();
        Assert.assertEquals(actualCount, expectedCount, "Cart badge count mismatch");
    }

    @When("User clicks on menu button")
    public void user_clicks_on_menu_button() {
        productsPage.clickMenu();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("User clicks on logout")
    public void user_clicks_on_logout() {
        productsPage.clickLogout();
    }

    @Then("User should be redirected to login page")
    public void user_should_be_redirected_to_login_page() {
        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("saucedemo.com"), "User is not redirected to login page. Current URL: " + currentUrl);
    }
}