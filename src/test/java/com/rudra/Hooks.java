package com.rudra;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage{
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.openBrowser();
    }

    @After
    public void tearDown(Scenario scenerio){
        if (scenerio.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

            byte[] src = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenerio.attach(src,"image/png","screenshots");
        }
        driverManager.closeBrowser();
    }
}
