package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class Annotations{

    @BeforeTest
    public void beforeTest() {
        System.out.println("Running before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Running before method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Running after test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Running after method");
    }

//    @BeforeClass
//    public void setDriver(ITestContext context) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        context.setAttribute("WebDriver", driver);
//    }
}
