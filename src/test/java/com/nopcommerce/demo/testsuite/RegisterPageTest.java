package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class RegisterPageTest extends BaseTest
{
    String actualText,expectedText;

    RegisterPage r1;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
        r1 = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        r1.clickOnRegisterLink();
        Assert.assertEquals(r1.verifyRegisterHeader(),"Register","Register Page Header Text Not Matched");
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory()
    {
        r1.clickOnRegisterLink();
        r1.clickOnRegisterButton();
        r1.errorFirstNameDisplayed();
        r1.errorLastNameDisplayed();
        r1.errorEmailDisplayed();
        r1.errorPasswordDisplayed();
        r1.errorConfirmDisplayed();
        //Assert.assertEquals();
    }

    @Test(dataProvider = "RegisterNewUser",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldCreateAccountSuccessfully(String gen,String fname,String lname,String day1,String month1, String year1,String mail1,String pass1,String conpass1)
    {
        r1.clickOnRegisterLink();
        r1.selectGender(gen);
        r1.enterFirstName(fname);
        r1.enterLastName(lname);
        r1.selectDay(day1);
        r1.selectMonth(month1);
        r1.selectYear(year1);
        r1.enterEmail(mail1);
        r1.enterPassword(pass1);
        r1.enterCofirmPassword(conpass1);
        r1.clickOnRegisterButton();
    }
}
