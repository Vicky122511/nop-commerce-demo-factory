package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility
{
    @CacheLookup

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerHeader;

    @FindBy(xpath="//label[@for='gender-male']")
    WebElement maleRadio;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadio;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy (xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement date;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailId;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement ferror;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lerror;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passError;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement conError;

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }
    public String verifyRegisterHeader()
    {
        return getTextFromElement(registerHeader);
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }


    public boolean errorFirstNameDisplayed()
    {
        return ferror.isDisplayed();
    }
    public boolean errorLastNameDisplayed()
    {
        return lerror.isDisplayed();
    }
    public boolean errorEmailDisplayed()
    {
        return emailError.isDisplayed();
    }
    public boolean errorPasswordDisplayed()
    {
        return passError.isDisplayed();
    }
    public boolean errorConfirmDisplayed()
    {
        return conError.isDisplayed();
    }

    public void selectGender(String gen)
    {
        clickOnElement(maleRadio);
    }
    public void enterFirstName(String fname)
    {
        sendTextToElement(firstName,fname);
    }
    public void enterLastName(String lname)
    {
        sendTextToElement(lastName,lname);
    }
    public void selectDay(String date1)
    {
        selectByVisibleTextFromDropDown(date,date1);
    }
    public void selectMonth(String m)
    {
        selectByVisibleTextFromDropDown(month,m);
    }
    public void selectYear(String yr)
    {
        selectByVisibleTextFromDropDown(year,yr);
    }
    public void enterEmail(String mail)
    {
        sendTextToElement(emailId,mail);
    }
    public void enterPassword(String pass1)
    {
        sendTextToElement(password,pass1);
    }
    public void enterCofirmPassword(String cPass)
    {
        sendTextToElement(confirmPassword,cPass);
    }
}
