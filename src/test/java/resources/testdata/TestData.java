package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData
{


    @DataProvider(name="validEmailPass")
    public Object[][] getData()

    {
        Object[][] data= new Object[][]
                {
                        {"vicky.shah7928@yahoo.com","abc@1234"},


                };
        return data;
    };

    @DataProvider(name="inValidEmailPass")
    public Object[][] dp1()
    {
        Object[][] data1= new Object[][]
                {
                        {"vicky.shah79281@yahoo.com","abc@1234"},
                };
        return data1;
    };

    @DataProvider(name="RegisterNewUser")
    public Object[][] dp2()
    {
        Object[][] data2= new Object[][]
                {
                        {"Male","Vicky","Shah","19","January","1978","vicky.shah19281@yahoo.com","abc@1234","abc@1234"},
                };
        return data2;
    };

    @DataProvider(name="BuildYourComputer")
    public Object[][] dp3()
    {
        Object[][] data2= new Object[][]
                {
                        {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]","8GB [+$60.00]","400 GB [+$100.00]","Vista Premium [+$60.00]","Microsoft Office [+$50.00]"},
                };
        return data2;
    };
}
