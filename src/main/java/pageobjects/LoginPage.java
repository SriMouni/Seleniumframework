package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class LoginPage {

    @FindBy(id = "spree_user_email")
    WebElement useremail;

    @FindBy(id = "spree_user_password")
    WebElement userpassword;

    @FindBy(name = "commit")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    WebElement invalidEmail;

    public void enterUserName(String userName)
    {
        useremail.sendKeys(userName);
    }
    public void enterPassword(String password)
    {
        userpassword.sendKeys(password);
    }
    public void clickSubmit()
    {
        submit.click();
    }

    public String getInvalidLoginText()
    {
        return invalidEmail.getText();
    }
}
