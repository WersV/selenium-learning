package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class State {

    WebDriver driver;

    @Test
    public void testState() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html?username=Mickey&password=Mouse");
        System.out.println(elementExist(By.cssSelector(".topSecret")));
        System.out.println(driver.findElement(By.cssSelector(".topSecret")).isDisplayed());

    }


    public boolean elementExist(By locator) {
        return !driver.findElements(locator).isEmpty();
    }
}
