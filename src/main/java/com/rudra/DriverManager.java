package com.rudra;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils{

    public void openBrowser(){
        System.setProperty("webdriver.chrome,driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
