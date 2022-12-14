package com.rudra;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{

    DriverManager driverManager = new DriverManager();

    @BeforeMethod
    public void setUp(){
        driverManager.openBrowser();
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception{
        if (!result.isSuccess()){
            takeScreenshot(result.getName());
        }
        driverManager.closeBrowser();
    }
}
