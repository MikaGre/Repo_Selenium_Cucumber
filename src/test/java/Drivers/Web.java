package Drivers;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Web {

    private static WebDriver driver;



    public static void initDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public static void closeDriver() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public static void deleteCookies() {
        driver.manage().deleteAllCookies();
    }



}
