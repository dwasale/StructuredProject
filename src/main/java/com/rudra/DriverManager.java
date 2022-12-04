package com.rudra;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverManager extends Utils{

 //   boolean isCloud = true;
    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browser = LoadProp.getProperty("Browser");
    //    String browserName = System.getProperty("browser");
    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();
    public void openBrowser(){
        //Run in a cloud-----------------------------------------------------
        if (runIncloud){
            System.out.println("Running in the cloud");
            //Connect to cloud
            if (browser.equalsIgnoreCase("Edge")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            } else if (browser.equalsIgnoreCase("Firefox"))
            {
                ///connect with browserstack
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            } else {
                System.out.println("Your browser name is wrong or missing implementation:" + browser);
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("Running locally");
            //Runs locally
            //It runs accordingly to the given browser to run
            if (browser.equalsIgnoreCase("Edge")){
                System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver");
                driver = new EdgeDriver();
            } else if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("FireFox")){
                System.setProperty("webdriver.firefox.driver", "src/test/java/drivers/geckodriver");
                driver = new FirefoxDriver();
            }

        }
        driver.get(LoadProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
