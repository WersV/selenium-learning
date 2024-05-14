package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Objects;


public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
    }

    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Dimension windowSize = new Dimension(500,500);
        driver.manage().window().setSize(windowSize);
    }

    public WebDriver getDriver(String browser) throws IllegalArgumentException{
        if(Objects.equals(browser, "chrome")) {
            return new ChromeDriver();
        } else if(browser.equals("firefox")) {
            return new FirefoxDriver();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
