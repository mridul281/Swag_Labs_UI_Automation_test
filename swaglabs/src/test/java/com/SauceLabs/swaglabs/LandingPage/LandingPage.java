package com.SauceLabs.swaglabs.LandingPage;

import com.SauceLabs.swaglabs.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    //menu button
    @FindBy(css = "#react-burger-menu-btn")
    public WebElement menuButton;
    public WebElement getMenuButton(){
        return menuButton;
    }
    //shopping curt link
    @FindBy(css = "#shopping_cart_container > a")
    public WebElement shoppingCurtLink;
    public WebElement getShoppingCurtLink() {
        return shoppingCurtLink;
    }
    //product short container
    @FindBy(css = "#header_container > div.header_secondary_container > div > span > select")
    public WebElement productShortContainer;
    public WebElement getProductShortContainer() {
        return productShortContainer;
    }

    //Add to cart
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;
    public WebElement getAddToCart() {
        return addToCart;
    }






}
