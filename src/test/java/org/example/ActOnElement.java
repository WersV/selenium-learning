package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActOnElement {

    @Test
    public void action() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium");
        WebElement mainPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        mainPageLink.click();
//        driver.findElement(By.id("clickOnMe")).click();
        WebElement nameInput = driver.findElement(By.xpath("//input[@name='fname']"));
        nameInput.sendKeys("Przemek");
//        WebElement passw = driver.findElement(By.name("password"));
//        passw.clear();
//        passw.sendKeys("12345");
//        passw.sendKeys(Keys.ENTER);
//        passw.sendKeys(Keys.TAB);
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkbox.click();
        driver.findElement(By.cssSelector("input[value='male']")).click();
        WebElement carSelect = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(carSelect);
        cars.selectByVisibleText("Saab");
//        driver.quit();
    }
}
