package Drivers;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Web {

    private static WebDriver driver;

    public static void initDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
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

    @After
    public void tearDown(){
        driver.quit();
    }

}
