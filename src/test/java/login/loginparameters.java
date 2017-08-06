package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.LoginSteps;
import steps.LoginStepswithObjects;
import util.DriverManager;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class loginparameters{
    WebDriver driver;

    @BeforeSuite
    public void beforesuite()
    {
        DriverManager manager = new DriverManager();

    }
    @Test
    public void verifyvalidLoginspree()
    {
       // LoginSteps loginparameters = new LoginSteps();
        LoginStepswithObjects loginparameters = new LoginStepswithObjects();
        String actual_message = loginparameters.Login("xt@xt1.com" , "123456789");
        Assert.assertEquals(actual_message , "MY ACCOUNT");
    }
}
