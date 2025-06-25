package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    private WebDriver driver;

    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cartLink;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isProductsPageDisplayed() {
        return pageTitle.getText().equals("Products");
    }

    public void addProductToCart(String productName) {
        String buttonId = "add-to-cart-" + productName.toLowerCase().replace(" ", "-");
        WebElement addToCartButton = driver.findElement(By.id(buttonId));
        addToCartButton.click();
    }

    public void clickMenu() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }

    public String getCartBadgeText() {
        return cartBadge.getText();
    }

    public boolean isCartBadgeDisplayed() {
        try {
            return cartBadge.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}