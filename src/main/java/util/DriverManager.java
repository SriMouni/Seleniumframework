package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by xt-user1 on 8/6/17.
 */
public class DriverManager {
    public static WebDriver driver;

    public  DriverManager()
    {
        String url = "http://10.136.124.50:3000";
        System.setProperty("webdriver.chrome.driver", "/Users/xt-user1/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);

    }
}
