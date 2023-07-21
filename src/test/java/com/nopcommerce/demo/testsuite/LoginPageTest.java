package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends BaseTest
{
    String actualText,expectedText;
    LoginPage l1;
    HomePage h1;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        l1 = new LoginPage();
        h1=new HomePage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() throws InterruptedException
    {
        Thread.sleep(1000);
        l1.clickOnLoginLink();
        actualText=l1.verifyWelComeMSG();
        expectedText="Welcome, Please Sign In!";
        Assert.assertEquals(actualText,expectedText,"Welcome Message on Login Page is Not Matched");

    }

    @Test(dataProvider = "inValidEmailPass",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String email,String pass) throws InterruptedException
    {
        l1.clickOnLoginLink();
        l1.enterEmailId(email);
        l1.enterPassword(pass);
        l1.clickOnLoginButton();
        Thread.sleep(1000);
        Assert.assertEquals(l1.verifyErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Error Message Not Matched");
    }

    @Test(dataProvider = "validEmailPass",dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String email,String pass)
    {
        l1.clickOnLoginLink();
        l1.enterEmailId(email);
        l1.enterPassword(pass);
        l1.clickOnLoginButton();

        h1.isLogoutLinkDisplayed();
    }

    @Test(dataProvider = "validEmailPass",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldLogOutSuccessFully(String email,String pass)
    {
        // Click on LogOut Link
        //	 Verify that LogIn Link Display
        l1.clickOnLoginLink();
        l1.enterEmailId(email);
        l1.enterPassword(pass);
        l1.clickOnLoginButton();
        l1.isLoginLinkDisplayed();
        Assert.assertEquals(actualText,expectedText,"Welcome Message on Login Page is Not Matched");
    }

}
