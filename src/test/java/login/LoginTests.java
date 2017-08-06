package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import util.DriverManager;
import static util.DriverManager.driver;

/**
 * Created by xt-user1 on 8/5/17.
 */
public class LoginTests{

    WebDriver driver;

    @BeforeSuite
    public void beforesuite()
    {
        //DriverManager driverManager = new DriverManager();
        String url = "http://10.136.124.50:3000";
        System.setProperty("webdriver.chrome.driver", "/Users/xt-user1/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }




    @Test(groups ={"smoke"} , priority = 2)
    public void verifyValidLoginintoSpree()
    {

        driver.findElement(By.id("link-to-login")).click();

        System.out.println("site is up running");

        driver.findElement(By.id("spree_user_email")).sendKeys("xt@xt1.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("123456789");

        driver.findElement(By.name("commit")).click();

        WebElement myAccountLink=  driver.findElement(By.linkText("MY ACCOUNT"));

        String actual = myAccountLink.getText();
        String expected = "MY ACCOUNT";
        Assert.assertEquals(expected , actual);

    }

    @Test(groups ={"smoke" , "regression"}, priority = 1)

    public void verifyInvalidLoginintoSpree()
    {


        driver.findElement(By.id("link-to-login")).click();

        System.out.println("site is up running");

        driver.findElement(By.id("spree_user_email")).sendKeys("xt@xtutr1.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("123456789");

        driver.findElement(By.name("commit")).click();

        WebElement errorMsg=  driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]"));

        String actual = errorMsg.getText();
        String expected = "Invalid email or password.";
        Assert.assertEquals(expected , actual);
        System.out.println("invalid login");

    }

    @Test(groups ={"smoke" , "regression"})
    public void verifyUserLoginwithEmptyUserName()
    {

    }

    @AfterSuite
    public void afterSuite()
    {
        driver.quit();
    }
}
