package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
    }

    @Test
    public void openGooglePage() {
//        String path = "C:\\JavaProgramowanie\\drivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", path);
        System.setProperty("webdriver.gecko.driver", "C:\\JavaProgramowanie\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}
