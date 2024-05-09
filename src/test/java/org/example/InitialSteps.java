package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class InitialSteps {


    private static final int WAIT_TIME = 10;

    private static final WebDriver driver;

    protected static HomePage homePage;

    static {

        /*
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        */
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");
        //options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);

        /*
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        */

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        homePage = new HomePage(driver);
    }

}
