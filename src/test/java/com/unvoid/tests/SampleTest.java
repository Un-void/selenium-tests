package com.unvoid.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

    @Test
    public void openHomePage() {

        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new EdgeDriver(options);

        driver.get("http://localhost:5173");

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}
