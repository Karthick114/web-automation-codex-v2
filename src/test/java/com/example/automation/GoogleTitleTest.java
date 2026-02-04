package com.example.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleTest {

    @Test
    public void verifiesGoogleTitle() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Google"), "Expected title to contain 'Google' but was: " + title);
        } finally {
            driver.quit();
        }
    }
}
