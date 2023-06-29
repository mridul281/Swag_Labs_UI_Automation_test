package com.SauceLabs.swaglabs.Pages;

import com.SauceLabs.swaglabs.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartProduct extends BasePage {

    public AddToCartProduct(WebDriver driver) {
        super(driver);
    }

    //Add to cart
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;
    public WebElement getAddToCart() {
        return addToCart;
    }


    //Add to cart
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    public WebElement addToCart2;
    public WebElement getAddToCart2() {
        return addToCart2;
    }

    //Shopping Cart Link
    @FindBy(css = "#shopping_cart_container > a")
    public WebElement shoppingCurtLink;
    public WebElement getShoppingCurtLink() {
        return shoppingCurtLink;
    }


    //checkout button
    @FindBy(css = "#checkout")
    public WebElement checkoutButton;
    public WebElement getCheckoutButton(){
        return checkoutButton;
    }
    // Input first name validation
    @FindBy(css = "#first-name")
    public WebElement input_FirstName;
    public WebElement getInput_FirstName() {
        return input_FirstName;
    }
    //Input Last name VALIDATION
    @FindBy(css = "#last-name")
    public WebElement input_LastName;
    public WebElement getInput_LastName() {
        return input_LastName;
    }
    //Input postal code
    @FindBy(css = "#postal-code")
    public WebElement input_PostalCode;
    public WebElement getInput_PostalCode() {
        return input_PostalCode;
    }
    //continue submit button
    @FindBy(css = "#continue-shopping")
    public WebElement continueSubmitbutton;
    public WebElement getContinueSubmitbutton(){
        return continueSubmitbutton;
    }

    //continue button
    @FindBy(css = "#continue")
    public WebElement continueButton;
    public WebElement getContinueButton(){
        return continueButton;
    }

    //cancel button
    @FindBy(css = "#cancel")
    public WebElement cancelButton;
    public WebElement getCancelButton () {
        return cancelButton;
    }
    //Finish Button
    @FindBy(css = "#finish")
    public WebElement finishButton;
    public WebElement getFinishButton() {
        return finishButton;
    }
    //Back to home button
    @FindBy(css = "#back-to-products")
    public WebElement backToHome_Button;
    public WebElement getBackToHome_Button() {
        return backToHome_Button;
    }



}
