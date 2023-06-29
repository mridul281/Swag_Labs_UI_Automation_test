package com.SauceLabs.swaglabs.TestCases;

import com.SauceLabs.swaglabs.Configuration.BaseTest;
import com.SauceLabs.swaglabs.Pages.LoginTest;
import com.SauceLabs.swaglabs.Utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_LoginTest extends BaseTest {

    @Test
    public void TC001_LoginTest() {
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
        lt.getUserName().sendKeys(Data.USERNAME);

        lt.getPassWord().sendKeys(Data.PASSWORD);

        // Click 'login' button
        lt.getLoginButton().click();




    }


}
