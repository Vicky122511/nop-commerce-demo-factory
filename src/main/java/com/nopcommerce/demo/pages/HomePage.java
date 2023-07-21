package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electricMenu;


    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownload;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelaryMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCards;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;

    @FindBy(xpath="")
    WebElement myAccount;

    public boolean isLogoutLinkDisplayed()
    {
        return logout.isDisplayed();
    }

    public void clickOnComputerMenu()
    {
        clickOnElement(computerMenu);
    }

    public void clickOnElectricMenu()
    {
        clickOnElement(electricMenu);
    }

    public void clickOnApparelMenu()
    {
        clickOnElement(apparelMenu);
    }
    public void clickOnDigitalDownloadMenu()
    {
        clickOnElement(digitalDownload);
    }

    public void clickOnBooksMenu()
    {
        clickOnElement(booksMenu);
    }


    public void clickOnJewelryrMenu()
    {
        clickOnElement(jewelaryMenu);
    }

    public void clickOnGiftCardsMenu()
    {
        clickOnElement(giftCards);
    }
}
