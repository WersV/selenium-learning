package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectByXPath {

    @Test
    public void select() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement btn = driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        WebElement linkContains = driver.findElement(By.xpath("//a[contains(text(), 'Visit')]"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        WebElement inputWithIndex = driver.findElement(By.xpath("(//input)[last()]"));
        WebElement inputWith2Index = driver.findElement(By.xpath("//*[@name]"));
        By chromeWorkaround = By.xpath("//*[substring(@name, string-length(@name) - 3 + 1)='ame']");
        WebElement endsWith = driver.findElement(chromeWorkaround);
        WebElement combiningTwoSelectors = driver.findElement(By.xpath("//a | //input"));
        driver.quit();
    }
}
