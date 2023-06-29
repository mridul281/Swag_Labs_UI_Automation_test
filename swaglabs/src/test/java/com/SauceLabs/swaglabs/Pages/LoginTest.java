package com.SauceLabs.swaglabs.Pages;

import com.SauceLabs.swaglabs.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTest extends BasePage {

    public LoginTest(WebDriver driver) {
        super (driver);
    }

    // login logo header
    @FindBy(css = "#root > div > div.login_logo")
    public WebElement login_logoHeader;
    public WebElement getLogin_logoHeader() {
        return login_logoHeader;
    }

    //login input field
    //username input
    @FindBy(css = "#user-name")
    public WebElement userName;
    public WebElement getUserName() {
        return userName;
    }
    //password input
    @FindBy(css = "#password")
    public WebElement passWord;
    public WebElement getPassWord() {
        return passWord;
    }
    //error message container
    @FindBy(css = "#login_button_container > div > form > div.error-message-container")
    public WebElement error_Message_Container;
    public WebElement getError_Message_Container() {
        return error_Message_Container;
    }
    //login button
    @FindBy(css = "#login-button")
    public WebElement loginButton;
    public WebElement getLoginButton() {
        return loginButton;
    }


}
