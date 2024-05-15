package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorsTest {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By btnId = By.id("clickOnMe");
        WebElement clickOnMeBtn = driver.findElement(btnId);

        By formName = By.name("fname");
        WebElement firstNameInput = driver.findElement(formName);

        WebElement secretClass = driver.findElement(By.className("topSecret"));

        WebElement firstInput = driver.findElement(By.tagName("input"));

        List<WebElement> allInputs = driver.findElements(By.tagName("input"));

        WebElement textLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        List<WebElement> textLinks = driver.findElements(By.partialLinkText("Visit"));

        System.out.println(textLinks.size());

        driver.quit();
    }
}
