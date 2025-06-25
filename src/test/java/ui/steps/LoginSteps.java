package ui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.openqa.selenium.WebDriver; // იმპორტი
import ui.pages.LoginPage;
import ui.pages.ProductsPage;
import utils.DriverManager;

public class LoginSteps {
    private LoginPage loginPage;
    private ProductsPage productsPage;

    public LoginSteps() {
        WebDriver driver = DriverManager.getDriver();
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        DriverManager.getDriver().get("https://www.saucedemo.com/");
    }

    @When("User enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @When("User enters invalid username {string} and password {string}")
    public void user_enters_invalid_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("User should be redirected to the products page")
    public void user_should_be_redirected_to_the_products_page() {
        Assert.assertTrue(productsPage.isProductsPageDisplayed(), "Products page is not displayed");
    }

    @Then("User should see an error message")
    public void user_should_see_an_error_message() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }
}