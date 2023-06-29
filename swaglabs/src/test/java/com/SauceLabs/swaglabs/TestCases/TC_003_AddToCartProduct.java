package com.SauceLabs.swaglabs.TestCases;

import com.SauceLabs.swaglabs.Configuration.BaseTest;
import com.SauceLabs.swaglabs.LandingPage.LandingPage;
import com.SauceLabs.swaglabs.Pages.AddToCartProduct;
import com.SauceLabs.swaglabs.Pages.LoginTest;
import com.SauceLabs.swaglabs.Utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_003_AddToCartProduct extends BaseTest {

    @Test
    public void TC_003_addToCartProduct() {
        LandingPage lp = new LandingPage(driver);
        AddToCartProduct acd = new AddToCartProduct(driver);
        LoginTest lt =new LoginTest(driver);



        //URL Validation
        String baseUrl = driver.getCurrentUrl();
        System.out.println(baseUrl);
        Assert.assertEquals(baseUrl, Data.BASE_URL);
        System.out.println("Home Page URL is visible");

        // Enter correct email address and password
        lt.getUserName().sendKeys(Data.USERNAME);

        lt.getPassWord().sendKeys(Data.PASSWORD);

        // Click 'login' button
        lt.getLoginButton().click();

        //Add to cart product
        lp.getAddToCart().click();
        sleepTime(1000);

        //shopping cart link
        lp.getShoppingCurtLink().click();
        sleepTime(2500);

        //Continue shopping button
        acd.getContinueSubmitbutton().click();
        sleepTime(1500);
        //
        acd.getAddToCart2().click();
        sleepTime(1500);

        acd.getShoppingCurtLink().click();
        sleepTime(2000);

        //
        acd.getCheckoutButton().click();
        sleepTime(2000);

        // check out information
        acd.getInput_FirstName().sendKeys(Data.INPUT_FIRSTNAME);
        acd.getInput_LastName().sendKeys(Data.INPUT_LASTNAME);
        acd.getInput_PostalCode().sendKeys(Data.INPUT_POSTALCODE);
        sleepTime(2000);

        //continue button
        acd.getContinueButton().click();
        sleepTime(2500);

        //finish button
        acd.getFinishButton().click();
        sleepTime(2000);

        driver.navigate().back();
        sleepTime(2000);











    }
}
