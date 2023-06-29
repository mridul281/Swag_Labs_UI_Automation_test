package com.SauceLabs.swaglabs.TestCases;

import com.SauceLabs.swaglabs.Configuration.BaseTest;
import com.SauceLabs.swaglabs.Pages.LoginTest;
import com.SauceLabs.swaglabs.Utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Incorrect_User_LoginUserNamePassword extends BaseTest {

    @Test
    public void TC002_Incorrect_User_LoginUserNamePassword() {


        LoginTest lt = new LoginTest(driver);

        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");


        // Verify 'Login to your account' is visible
        if (lt.getLogin_logoHeader().isDisplayed()) {
            String Login_logoHeader = lt.getLogin_logoHeader().getText();
            Assert.assertTrue(true, Login_logoHeader);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter correct email address and password
        lt.getUserName().sendKeys(Data.INPUT_INCORRECT_NAME);

        lt.getPassWord().sendKeys(Data.INPUT_INCORRECT_PASSWORD);

        //Error message container
        if (lt.getError_Message_Container().isDisplayed()) {
            String Error_Message_Container = lt.getError_Message_Container().getText();
            Assert.assertTrue(true, Error_Message_Container);
        } else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'login' button
        lt.getLoginButton().click();
    }


}
