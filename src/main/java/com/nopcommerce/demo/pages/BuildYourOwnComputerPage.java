package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYour;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd;

    @FindBy(xpath = "//label[@for='product_attribute_4_9']")
    WebElement os;

    @FindBy(xpath = "//label[@for='product_attribute_5_10']")
    WebElement software;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addCart;
    public void clickOnBuildYourComputer()
    {
        clickOnElement(buildYour);
    }
    public void selectProcessor(String process)
    {
        selectByVisibleTextFromDropDown(processor,process);
    }
    public void selectRam(String rm)
    {
        selectByVisibleTextFromDropDown(ram,rm);
    }
    public void selectHDD(String hd)
    {
        clickOnElement(hdd);
    }
    public void selectOS(String os1)
    {
        clickOnElement(os);
    }
    public void selectSoftware(String sw)
    {
        clickOnElement(software);
    }
}
