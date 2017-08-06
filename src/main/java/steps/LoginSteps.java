package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import util.DriverManager;

import static util.DriverManager.driver;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class LoginSteps   {


    public  String Login(String userName , String password)
    {

        driver.findElement(By.id("link-to-login")).click();

        System.out.println("site is up running");

        driver.findElement(By.id("spree_user_email")).sendKeys(userName);
        driver.findElement(By.id("spree_user_password")).sendKeys(password);

        driver.findElement(By.name("commit")).click();

        WebElement myAccountLink=  driver.findElement(By.linkText("MY ACCOUNT"));

        String actual = myAccountLink.getText();
        return actual;



    }
}
