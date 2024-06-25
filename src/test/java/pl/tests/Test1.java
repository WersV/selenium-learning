package pl.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Annotations;
import org.example.DriverFactory;
import org.example.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {Listener.class})
public class Test1 extends Annotations {

    @Test
    public void Test1Method() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//2131"));
    }

//    @Test
//    public void Test2Method() {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com");
//    }
}
