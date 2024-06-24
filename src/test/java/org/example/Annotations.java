package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Annotations {

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
}
