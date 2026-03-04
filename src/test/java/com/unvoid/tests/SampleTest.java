package com.unvoid.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    @Test
    public void openHomePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000"); // replace with your app URL
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
    }
}
