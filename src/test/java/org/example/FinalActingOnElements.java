package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

public class FinalActingOnElements {
    @Test
    public void act() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        Actions actions = new Actions(driver);

        //Elements localization
        WebElement h1El = driver.findElement(By.cssSelector("h1"));
        actions.moveToElement(h1El).perform();

        driver.findElement(By.cssSelector("#clickOnMe")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.name("fname")).sendKeys("Przemek");
        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        WebElement selectEl = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectEl);
        cars.selectByVisibleText("Saab");

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        driver.findElement(By.cssSelector("input[type='radio'][value='male']")).click();

        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        username.clear();
        username.sendKeys("WersV");

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.clear();
        password.sendKeys("SilneHasło1!");


        driver.findElement(By.cssSelector("input[type='submit'][value='Submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();

        driver.findElement(By.id("newPage")).click();
        String currentWindow = driver.getWindowHandle();
        Set<String> windowNames = driver.getWindowHandles();
        for(String window : windowNames) {
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }

        driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']")).click();
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);

        driver.switchTo().window(currentWindow);

        driver.findElement(By.cssSelector("#container ul li ul li"));

//        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm");
//        LocalTime currentTime = LocalTime.now();
//        String hourAndMin = currentTime.format(formatter);
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile, new File("src/test/resources/screenshot_" + currentDate + "_" + hourAndMin +".png"));


   }
}
