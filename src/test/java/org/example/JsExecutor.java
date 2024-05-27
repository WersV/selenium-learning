package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecutor {

    @Test
    public void testExecutor() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement nameInput = driver.findElement(By.cssSelector("#fname"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('value', 'Przemek')", nameInput);
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.findElement(By.xpath("//a[text()='Załadowanie pliku']")).click();
        driver.findElement(By.cssSelector("#myFile")).sendKeys("C:\\Users\\Przemek\\Downloads\\sample.txt");
    }
}
