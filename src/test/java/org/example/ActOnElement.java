package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
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
        System.out.println(nameInput.getAttribute("value"));
        WebElement passw = driver.findElement(By.name("password"));
        passw.clear();
        passw.sendKeys("12345");
        passw.sendKeys(Keys.ENTER);
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();
        Alert secondAlert = driver.switchTo().alert();
        secondAlert.accept();
//        passw.sendKeys(Keys.TAB);
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkbox.click();
        driver.findElement(By.cssSelector("input[value='male']")).click();
        WebElement carSelect = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(carSelect);
        cars.selectByVisibleText("Saab");

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        SelectCheck check = new SelectCheck();
//        System.out.println(check.checkSelect("Audi", selectCar));

        driver.quit();
    }
}
