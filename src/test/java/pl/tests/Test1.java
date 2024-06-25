package pl.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Annotations;
import org.example.DriverFactory;
import org.example.Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {Listener.class})
public class Test1 extends Annotations {

    public void Test1Method() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.google.com");
    }

    @Test(dataProvider = "data")
    public void dpTest(String val) {
        System.out.println(val);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        return new Object[][] {{"I am first test"}, {"I am second test"}, {"I am third test"}};
    }

//    @Test
//    public void Test2Method() {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com");
//    }
}
