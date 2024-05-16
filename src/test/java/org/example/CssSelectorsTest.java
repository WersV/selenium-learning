package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CssSelectorsTest {

    @Test
    public void searchByCssSelectors() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement idEl = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement attributeEl = driver.findElement(By.cssSelector("input[name='fname']"));

        List<WebElement> allUlElements = driver.findElements(By.cssSelector("div ul"));

        WebElement attrContains = driver.findElement(By.cssSelector("[name*='name']"));
        WebElement attrStarts = driver.findElement(By.cssSelector("[name^='user']"));
        WebElement attrEnds = driver.findElement(By.cssSelector("[name$='e']"));

        WebElement firstChild = driver.findElement(By.cssSelector("li:first-child"));
        WebElement lastChild = driver.findElement(By.cssSelector("li:last-child"));
        driver.quit();
    }
}
