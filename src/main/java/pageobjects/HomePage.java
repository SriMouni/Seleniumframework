package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class HomePage {

    @FindBy(linkText = "MY ACCOUNT")
    WebElement my_account;

    @FindBy(id = "link-to-login")
    WebElement login_link;

    @FindBy(linkText = "LOGOUT")
    WebElement logout;

    public void clickOnLoginLink()
    {
        login_link.click();
    }

    public String getMyAccountText()
    {
        return my_account.getText();
    }
    public void clickLogout()
    {
        logout.click();
    }


}
