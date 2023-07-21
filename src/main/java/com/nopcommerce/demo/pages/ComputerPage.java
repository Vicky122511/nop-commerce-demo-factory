package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerHeader;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    @FindBy(xpath ="//li[@class='inactive']//a[normalize-space()='Notebooks']")
    WebElement notebookLink;

    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Software']")
    WebElement softwareLink;


    public String verifyComputeHeaderText()
    {
        return getTextFromElement(computerHeader);
    }

    public void clickOnDesktopLink()
    {
        clickOnElement(desktopLink);
    }
    public void clickOnNotebookLink()
    {
        clickOnElement(notebookLink);
    }
    public void clickOnSoftwareLink()
    {
        clickOnElement(softwareLink);
    }
}
