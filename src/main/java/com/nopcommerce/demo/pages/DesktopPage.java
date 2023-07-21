package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DesktopPage extends Utility
{
    @CacheLookup

    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopHeader;

    @FindBy(xpath="")
    WebElement sortBy;


    @Test
    public String verifyDesktopHeader()
    {
        return  getTextFromElement(desktopHeader);
    }

}
