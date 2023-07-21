package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest
{
    ComputerPage cp1;
    HomePage hp1;
    BuildYourOwnComputerPage bp1;

    @BeforeMethod(alwaysRun = true)
    public void inIT()
    {
       cp1=new ComputerPage();
       hp1 = new HomePage();
       bp1= new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully()
    {
        hp1.clickOnComputerMenu();
        Assert.assertEquals(cp1.verifyComputeHeaderText(),"Computer","Computer Header Text Not Matched");
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()
    {
        hp1.clickOnComputerMenu();
        cp1.clickOnDesktopLink();
    }

    @Test(dataProvider = "BuildYourComputer",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,String hdd, String os, String software) throws InterruptedException
    {
        //String processor, String ram,String hdd, String os, String software
        hp1.clickOnComputerMenu();
        cp1.clickOnDesktopLink();
        bp1.clickOnBuildYourComputer();
        bp1.selectProcessor(processor);
        Thread.sleep(5000);
        bp1.selectRam(ram);
        bp1.selectHDD(hdd);
        bp1.selectOS(os);
        bp1.selectSoftware(software);


    }
}
