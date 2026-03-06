package com.unvoid.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SampleTest {

    @Test
    public void openHomePage() {

        System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--user-data-dir=C:\\temp\\edge-profile");

        WebDriver driver = new EdgeDriver(options);

        driver.get("http://localhost:5173");

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}
