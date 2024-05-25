package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class testNewWindow {

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement newPage = driver.findElement(By.cssSelector("#newPage"));
        newPage.click();
        String currentWindow = driver.getWindowHandle();
        Set<String> windowNames = driver.getWindowHandles();
        for(String window : windowNames) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
        WebElement acceptBtn = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        acceptBtn.click();
        driver.switchTo().window(currentWindow);
    }
}
