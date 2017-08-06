package steps;

import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import util.DriverManager;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class LoginStepswithObjects {
    HomePage homePage;
    LoginPage loginPage;

    public LoginStepswithObjects()
    {
        homePage = PageFactory.initElements(DriverManager.driver , HomePage.class);
        loginPage = PageFactory.initElements(DriverManager.driver , LoginPage.class);

    }

    public String Login(String userName , String passowrd)
    {
        homePage.clickOnLoginLink();
        loginPage.enterUserName(userName);
        loginPage.enterPassword(passowrd);
        loginPage.clickSubmit();
        return homePage.getMyAccountText();
    }
}
